import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import {HttpModule, Http} from '@angular/http';
import { PaginationModule } from 'ng2-bootstrap/ng2-bootstrap';
import { TabsModule } from 'ng2-bootstrap/ng2-bootstrap';
import { Ng2TableModule } from 'ng2-table/ng2-table';
import {PopupModule} from 'ng2-opd-popup';

import {TranslateModule, TranslateLoader} from '@ngx-translate/core';
import {TranslateHttpLoader} from '@ngx-translate/http-loader';

import { routing } from './app.routes';

import { AppComponent } from './app.component';
import { MenuComponent } from './menu/menu.component';
import { HomeComponent } from './home/home.component';
import { IncomeTaxTableComponent } from './income_tax/main_page/table.component';
import { IncomeTaxFormComponent } from './income_tax/calculating_form/calculating.component';

import {Collapse} from './income_tax/main_page/collapse'

export function HttpLoaderFactory(http: Http) {
  return new TranslateHttpLoader(http, './i18n/', '.json');
}

@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    IncomeTaxFormComponent,
    IncomeTaxTableComponent,
    HomeComponent,
    Collapse
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    routing,
    PopupModule.forRoot(),
    PaginationModule,
    TabsModule,
    Ng2TableModule,
    TranslateModule.forRoot({
      loader: {
        provide: TranslateLoader,
        useFactory: HttpLoaderFactory,
        deps: [Http]
      }
    })
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
