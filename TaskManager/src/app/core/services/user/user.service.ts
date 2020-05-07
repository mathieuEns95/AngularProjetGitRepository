import { Injectable } from '@angular/core';
import {User} from '../../models/user';
import {HttpClient} from '@angular/common/http';
import {environment} from '../../../../environments/environment';
import {Observable} from 'rxjs';
import {map} from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class UserService {
  private users: User[] = [];
  constructor(private httpClient: HttpClient) {
  }
  /* public addUser(user: User) {this.users.push(user); }
   // tslint:disable-next-line:max-line-length
   public updateUser(user: User) {
     const index = this.users.findIndex(current => current.username = user.username);
     this.users[index] = Object.assign(new User('', '', '', '', '', ''), user) ; }
   // @ts-ignore
   public delete(user: User) {
     const index = this.users.findIndex(current => current.username = user.username);
     const deleteItem = this.users.splice(index, 1);
   }
   // @ts-ignore
   public findUser(username: string): User {
     const ser = this.users.findIndex(current => current.username = username);
     return Object.assign(new User('', '', '', '', '', ''), ser);
   }
   // @ts-ignore
   // tslint:disable-next-line:align no-unused-expression*/
  public getAllUsers(): Observable<User[]> {
    return this.httpClient.get<any>(`${environment.urlBackend}users/`)
      .pipe(map(result => result._embedded.users));
  }
  public addUser(user: User) {
    this.httpClient.post(`${environment.urlBackend}users`, user).subscribe();
  }
}
