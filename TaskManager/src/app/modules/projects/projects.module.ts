import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProjectsRoutingModule } from './projects-routing.module';
import { ProjectsComponent } from './projects.component';
import { AddProjectComponent } from './add-project/add-project.component';
import { ListProjectsComponent } from './list-projects/list-projects.component';
import { ViewProjectComponent } from './view-project/view-project.component';
import { ViewStatsticsComponent } from './view-statstics/view-statstics.component';



@NgModule({
  declarations: [ProjectsComponent, AddProjectComponent, ListProjectsComponent, ViewProjectComponent, ViewStatsticsComponent],
  imports: [
    CommonModule,
    ProjectsRoutingModule
  ]
})
export class ProjectsModule { }
