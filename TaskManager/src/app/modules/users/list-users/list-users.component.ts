import { Component, OnInit } from '@angular/core';
import {UserService} from '../../../core/services/user/user.service';
import {User} from '../../../core/models/user';

@Component({
  selector: 'app-list-users',
  templateUrl: './list-users.component.html',
  styleUrls: ['./list-users.component.css']
})
export class ListUsersComponent implements OnInit {
  private users: User[] = [];
  displayedColumns: string[] = ['username', 'firstName', 'lastName', 'email', 'role'];

  constructor(private userService: UserService) { }

  ngOnInit() {

    this.userService.getAllUsers().subscribe(users => this.users = users);
  }

}
