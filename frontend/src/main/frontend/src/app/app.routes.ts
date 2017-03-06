import { ModuleWithProviders }  from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { IncomeTaxTableComponent }      from './income_tax/results/table.component';


const appRoutes: Routes = [

    {
      path: 'incomeTaxTable',
      component: IncomeTaxTableComponent
     },
    {
      path: '**',
      component: IncomeTaxTableComponent,
    }
];

export const routing: ModuleWithProviders = RouterModule.forRoot(appRoutes);
