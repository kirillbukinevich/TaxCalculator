import {Component, OnInit} from '@angular/core';
import { DataTableResource } from 'angular-2-data-table';
import {HttpService} from "./http.service";
import { Response} from '@angular/http';


@Component({
  selector: 'income-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css'],
  providers: [HttpService]
})
export class IncomeTaxTable implements OnInit {
  incomeTaxes = [];
  // itemResource = new DataTableResource(persons);

  constructor(private httpService: HttpService){}

  ngOnInit(){
    this.httpService.getData().subscribe((data: Response) => this.incomeTaxes=data.json());
  }
}
