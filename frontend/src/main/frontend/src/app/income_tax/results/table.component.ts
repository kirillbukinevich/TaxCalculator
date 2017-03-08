import {Component, OnInit, EventEmitter, OnChanges, SimpleChanges, Input} from "@angular/core";
import {HttpService} from "../http.service";
import {IncomeTax} from "../../interface/income-tax.interface";
import {Filter} from "../../interface/filter.interface";
import {Response} from "@angular/http";
import {TranslateService, LangChangeEvent} from "@ngx-translate/core";
import {ActivatedRoute} from "@angular/router";


@Component({
  selector: 'income-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css'],
  providers: [HttpService],
})
export class IncomeTaxTableComponent implements OnInit  {


  public onLangChange: EventEmitter<LangChangeEvent> = new EventEmitter<LangChangeEvent>();
  val1: number = 5;

  translate: TranslateService;
  incomeTaxes: IncomeTax[] = [

    {
      "period": "QUARTER",
      "profitFromGoods": 0,
      "profitOther": 0,
      "hasWork": false,
      "hasBenefits": false,
      "hasFamilyBenefits": false,
      "numberOfMinors": 0,
      "disabledChildren": 0,
      "dependents": 0,
      "insuranceCost": 0,
      "educationalCost": 0,
      "housingCost": 0,
      "businessCost": 0,
      "total": 0
    },
    {
      "period": "QUARTER",
      "profitFromGoods": 0,
      "profitOther": 0,
      "hasWork": false,
      "hasBenefits": false,
      "hasFamilyBenefits": false,
      "numberOfMinors": 0,
      "disabledChildren": 0,
      "dependents": 0,
      "insuranceCost": 0,
      "educationalCost": 0,
      "housingCost": 0,
      "businessCost": 0,
      "total": 0
    },
    {
      "period": "QUARTER",
      "profitFromGoods": 123423,
      "profitOther": 0,
      "hasWork": true,
      "hasBenefits": false,
      "hasFamilyBenefits": false,
      "numberOfMinors": 0,
      "disabledChildren": 0,
      "dependents": 0,
      "insuranceCost": 0,
      "educationalCost": 0,
      "housingCost": 0,
      "businessCost": 0,
      "total": 19747
    }

  ];
  languageObject: any;

  public columns: Array<any> = [
    {title: 'period', name: 'period'},
    {title: 'goods profit', name: 'profitFromGoods'},
    {title: 'other profit', name: 'profitOther'},
    {title: 'has work', name: 'hasWork'},
    {title: 'benefits', name: 'hasBenefits'},
    {title: 'family benefits', name: 'hasFamilyBenefits'},
    {title: 'number of minors', name: 'numberOfMinors'},
    {title: 'disabled children', name: 'disabledChildren'},
    {title: 'dependents', name: 'dependents'},
    {title: 'insurance cost', name: 'insuranceCost'},
    {title: 'educational cost', name: 'educationalCost'},
    {title: 'housing cost', name: 'housingCost'},
    {title: 'business cost', name: 'businessCost'},
    {title: 'total', name: 'total'},
  ];


  constructor(private httpService: HttpService,translate: TranslateService,private activateRoute: ActivatedRoute) {
    this.translate = translate;
    this.onLangChange = this.translate.onLangChange.subscribe((event: LangChangeEvent) => {
      console.log("!!!!!!!!!!!!!!!!!!!");
      this.changeLanguage();
    });

  }

  ngOnInit() {
    this.changeLanguage();
    console.log('ngOnInit');
    // this.httpService.getData().subscribe((data: Response) => {
    //   this.incomeTaxes = data.json();
      this.onChangeTable(this.config);
      this.length = this.incomeTaxes.length;

    // });


  }


  onNotify(person_info: IncomeTax): void {
    alert(person_info.businessCost);
    console.dir('person_info: ' + person_info.total);
    console.log(this.httpService.saveIncomeTax(person_info));
    this.incomeTaxes.push(person_info);
    this.onChangeTable(this.config);
  }

  public rows: Array<any> = [];

  public page: number = 1;
  public itemsPerPage: number = 10;
  public maxSize: number = 5;
  public numPages: number = 1;
  public length: number = 0;

  public config: any = {
    paging: true,
    sorting: {columns: this.columns},
    filtering: {filterString: ''},
    className: ['table-striped', 'table-bordered']
  };

  public changePage(page: any, data: Array<any> = this.incomeTaxes): Array<any> {
    let start = (page.page - 1) * page.itemsPerPage;
    let end = page.itemsPerPage > -1 ? (start + page.itemsPerPage) : data.length;
    return data.slice(start, end);
  }

  public changeSort(data: any, config: any): any {
    if (!config.sorting) {
      return data;
    }

    let columns = this.config.sorting.columns || [];
    let columnName: string = void 0;
    let sort: string = void 0;

    for (let i = 0; i < columns.length; i++) {
      if (columns[i].sort !== '' && columns[i].sort !== false) {
        columnName = columns[i].name;
        sort = columns[i].sort;
      }
    }

    if (!columnName) {
      return data;
    }

    // simple sorting
    return data.sort((previous: any, current: any) => {
      if (previous[columnName] > current[columnName]) {
        return sort === 'desc' ? -1 : 1;
      } else if (previous[columnName] < current[columnName]) {
        return sort === 'asc' ? -1 : 1;
      }
      return 0;
    });
  }

  public changeFilter(data: any, config: any): any {
    let filteredData: Array<any> = data;
    this.columns.forEach((column: any) => {
      if (column.filtering) {
        filteredData = filteredData.filter((item: any) => {
          return item[column.name].match(column.filtering.filterString);
        });
      }
    });

    if (!config.filtering) {
      return filteredData;
    }

    if (config.filtering.columnName) {
      return filteredData.filter((item: any) =>
        item[config.filtering.columnName].match(this.config.filtering.filterString));
    }

    let tempArray: Array<any> = [];
    filteredData.forEach((item: any) => {
      let flag = false;
      this.columns.forEach((column: any) => {
        if (item[column.name].toString().match(this.config.filtering.filterString)) {
          flag = true;
        }
      });
      if (flag) {
        tempArray.push(item);
      }
    });
    filteredData = tempArray;

    return filteredData;
  }

  public onChangeTable(config: any, page: any = {page: this.page, itemsPerPage: this.itemsPerPage}): any {
    if (config.filtering) {
      Object.assign(this.config.filtering, config.filtering);
    }

    if (config.sorting) {
      Object.assign(this.config.sorting, config.sorting);
    }

    let filteredData = this.changeFilter(this.incomeTaxes, this.config);
    let sortedData = this.changeSort(filteredData, this.config);
    this.rows = page && config.paging ? this.changePage(page, sortedData) : sortedData;
    this.length = sortedData.length;
  }

  public onCellClick(data: any): any {
    console.log(data);
  }

  filter: Filter = {
    "fromTotal": 0,
    "toTotal": 0
  };

  filterByTotal(target): void {

    console.log("form: " + this.filter.fromTotal + " to: " + this.filter.toTotal);
    if (!this.filter.fromTotal) {
      this.filter.fromTotal = 0;
    }
    if (!this.filter.toTotal) {
      this.filter.toTotal = 0;
    }
    if(this.filter.fromTotal == 0 &&
      this.filter.toTotal == 0){
      this.onChangeTable(this.config);

    }
    if (this.filter.fromTotal > this.filter.toTotal) {
      this.filter.fromTotal = 0;
      return;
    }

    let incomeTaxesTemp: IncomeTax[] = [];
    incomeTaxesTemp = this.incomeTaxes;

      this.incomeTaxes = this.incomeTaxes.filter(
        incomeTax => incomeTax.total >= this.filter.fromTotal);

      this.incomeTaxes = this.incomeTaxes.filter(
        incomeTax => incomeTax.total <= this.filter.toTotal);

    this.onChangeTable(this.config);

    this.incomeTaxes = incomeTaxesTemp;
  }

  changeLanguage(){
    this.translate.getTranslation(this.translate.currentLang).subscribe((res: string) => {
      console.log(res);
      console.log(res["HOME"]["HELLO"]);
      this.columns = [
        {title: res["INCOME_TAX"]["PERIOD"], name: 'period'},
        {title: res["INCOME_TAX"]["PROFITFROMGOODS"], name: 'profitFromGoods'},
        {title: res["INCOME_TAX"]["PROFITOTHER"], name: 'profitOther'},
        {title: res["INCOME_TAX"]["HASWORK"], name: 'hasWork'},
        {title: res["INCOME_TAX"]["HASBENEFITS"], name: 'hasBenefits'},
        {title: res["INCOME_TAX"]["HASFAMILYBENEFITS"], name: 'hasFamilyBenefits'},
        {title: res["INCOME_TAX"]["NUMBEROFMINORS"], name: 'numberOfMinors'},
        {title: res["INCOME_TAX"]["DISABLEDCHILDREN"], name: 'disabledChildren'},
        {title: res["INCOME_TAX"]["DEPENDENTS"], name: 'dependents'},
        {title: res["INCOME_TAX"]["INSURANCECOST"], name: 'insuranceCost'},
        {title: res["INCOME_TAX"]["EDUCATIONALCOST"], name: 'educationalCost'},
        {title: res["INCOME_TAX"]["HOUSINGCOST"], name: 'housingCost'},
        {title: res["INCOME_TAX"]["BUSINESSCOST"], name: 'businessCost'},
        {title: res["INCOME_TAX"]["TOTAL"], name: 'total'},
      ]

    });
  }
}
