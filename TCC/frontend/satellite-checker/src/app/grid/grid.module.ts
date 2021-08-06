import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DashboardComponent } from '../dashboard/dashboard.component';
import { GridComponent } from './grid.component';
import { ChartsModule } from 'ng2-charts';
import { MatGridListModule } from '@angular/material/grid-list';
import { CurrentComponent } from '../charts/current/current.component';




@NgModule({
  declarations: [
    DashboardComponent,
    CurrentComponent,
    GridComponent
  ],
  imports: [
    CommonModule,
    MatGridListModule,
    ChartsModule
  ],
  exports:[
    DashboardComponent,
    GridComponent
  ]
})
export class GridModule { }
