import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { FormGroup } from '@angular/forms';

@IonicPage()
@Component({
  selector: 'page-signup',
  templateUrl: 'signup.html',
})
export class SignupPage {

  signupForm: FormGroup;
  constructor(public navCtrl: NavController, public navParams: NavParams) {
  }

  onSubmit(): void {
    console.log('Form submited');
  }

}
