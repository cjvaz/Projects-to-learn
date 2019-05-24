import { NgModule } from '@angular/core';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';

import { SigninComponent } from './signin/signin.component';
import { CommonModule } from '@angular/common';
import { VMessageComponent } from '../shared/components/vmessage/vmessage.component';
import { VMessageModule } from '../shared/components/vmessage/vmessage.module';
import { RouterModule } from '@angular/router';
import { SignUpComponent } from './signup/signup.component';
import { HomeComponent } from './home.component';

@NgModule({
    declarations: [
      SigninComponent,
      SignUpComponent,
      HomeComponent
  ],
    imports: [
      CommonModule,
      FormsModule,
      ReactiveFormsModule,
      VMessageModule,
      RouterModule
    ]
})
export class HomeModule { }
