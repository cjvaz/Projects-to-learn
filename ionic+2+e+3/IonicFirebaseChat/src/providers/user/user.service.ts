import { Injectable } from '@angular/core';
import { AngularFireDatabase } from 'angularfire2/database'
import { User } from '../../models/user.model';

import 'rxjs/add/operator/map'
@Injectable()
export class UserService {

  constructor(public db: AngularFireDatabase) {
    console.log('Hello UserProvider Provider');
  }

  create(user: User): Promise<void> {
    return Promise.resolve(this.db.list('/users').push(user));
  }

}
