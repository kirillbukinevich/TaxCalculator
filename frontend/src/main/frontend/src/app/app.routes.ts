import { ModuleWithProviders }  from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { IncomeTaxTableComponent }      from './income_tax/results/table.component';
import {HomeComponent} from "./home/home.component";


const appRoutes: Routes = [

    {
      path: 'incomeTaxTable',
      component: IncomeTaxTableComponent
     },
    {
      path: 'home',
      component: HomeComponent
     },
    {
      path: '**',
      component: HomeComponent,
    }
];

export const routing: ModuleWithProviders = RouterModule.forRoot(appRoutes);
