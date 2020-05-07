import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ProjectsComponent } from './projects.component';
import {ListUsersComponent} from "../users/list-users/list-users.component";
import {AddUserComponent} from "../users/add-user/add-user.component";
import {ViewProjectComponent} from "./view-project/view-project.component";
import {AddProjectComponent} from "./add-project/add-project.component";
import {ListProjectsComponent} from "./list-projects/list-projects.component";
import {ViewStatsticsComponent} from "./view-statstics/view-statstics.component";

const routes: Routes = [
  {path: '', component: ListProjectsComponent },
  {path: 'add', component: AddProjectComponent },
  {path: 'view/:id', component: ViewProjectComponent },
  {path: 'statistic', component: ViewStatsticsComponent }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProjectsRoutingModule { }
