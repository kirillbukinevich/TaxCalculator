import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { DataTableModule } from 'angular-2-data-table';
import { routing } from './app.routes';

import { AppComponent } from './app.component';
import { MenuComponent } from './menu/menu.component';
import { IncomeTaxTableComponent } from './income_tax/results/table.component';
import { IncomeTaxFormComponent } from './income_tax/form/form.component';


import {PopupModule} from 'ng2-opd-popup';

@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    IncomeTaxFormComponent,
    IncomeTaxTableComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    DataTableModule,
    routing,
    PopupModule.forRoot()
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
