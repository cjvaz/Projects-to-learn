import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';

import { SigninComponent } from './signin/signin.component';
import { CommonModule } from '@angular/common';

@NgModule({
    declarations: [ SigninComponent ],
    imports: [
      CommonModule,
      ReactiveFormsModule
    ]
})
export class HomeModule { }
