import {Component, OnInit} from '@angular/core';
import { DataTableResource } from 'angular-2-data-table';
import {HttpService} from "../http.service";
import { Response} from '@angular/http';
import {IncomeTaxFormComponent} from "../form/form.component";
import {IncomeTax} from "../../interface/income-tax.interface";


@Component({
  selector: 'income-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css'],
  providers: [HttpService],
  directives: [IncomeTaxFormComponent]
})
export class IncomeTaxTableComponent implements OnInit {
  incomeTaxes:IncomeTax[] = [];
  // itemResource = new DataTableResource(persons);

  constructor(private httpService: HttpService){}

  ngOnInit(){
    console.log("HERE");
    this.httpService.getData().subscribe((data: Response) => this.incomeTaxes=data.json());

  }


  onNotify(person_info:IncomeTax):void {
    alert(person_info.businessCost);
    console.dir("person_info: " + person_info.period);
    console.log(this.httpService.saveIncomeTax(person_info));
    this.incomeTaxes.push(person_info);
  }
}
