import { Component, OnInit } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import {MatSelectModule} from '@angular/material/select';


@Component({
  selector: 'app-dialog-newsat',
  templateUrl: './dialog-newsat.component.html',
  styleUrls: ['./dialog-newsat.component.css']
})
export class DialogNewsatComponent implements OnInit {

  constructor(public dialogRef: MatDialogRef<DialogNewsatComponent>) {}

  cancel(): void {
    this.dialogRef.close();
  }

  ngOnInit(): void {
  }

}
