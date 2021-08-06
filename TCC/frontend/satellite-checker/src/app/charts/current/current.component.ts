import { Component, OnInit } from '@angular/core';
import { ChartOptions, ChartType, ChartDataSets } from 'chart.js';
import {  Color, Label } from 'ng2-charts';

@Component({
  selector: 'app-current',
  templateUrl: './current.component.html',
  styleUrls: ['./current.component.css']
})
export class CurrentComponent implements OnInit {

  ChartOptions: ChartOptions = {
    responsive: true,
    scales: {
      yAxes: [
       {
        display: true,
        scaleLabel: {
         display: true,
         labelString: "Ampere",
        },
       },
      ],
      xAxes: [
       {
        scaleLabel: {
         display: true,
         labelString: "Time",
        },
       },
      ],
     }
  };
  ChartLabels: Label[] = ['1', '2', '3', '4', '5', '6'];
  ChartType: ChartType = 'line';
  ChartLegend = true;
  ChartPlugins = [];

  ChartData: ChartDataSets[] = [
    { data: [45, 37, 60, 70, 46, 33], label: 'Current', fill: false }
  ];
  
  ChartColors: Color[] = [
    {
      borderColor: 'yellow'
    }];


  constructor() { }

  ngOnInit(): void {
  }

}
