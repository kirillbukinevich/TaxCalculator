import { BrowserModule } from '@angular/platform-browser';
import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { DataTableModule } from 'angular-2-data-table';

import { AppComponent } from './app.component';
import { IncomeTaxTable } from './income_tax/table.component';


@NgModule({
  declarations: [
    AppComponent,
    IncomeTaxTable
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    DataTableModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
