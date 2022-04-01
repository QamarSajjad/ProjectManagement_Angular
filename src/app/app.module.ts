import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomePageComponent } from './home-page/home-page.component';
import { FooterPageComponent } from './footer-page/footer-page.component';
import { AddProjectsComponent } from './add-projects/add-projects.component';
import { AllProjectsComponent } from './all-projects/all-projects.component';

// import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { UserDetailsComponent } from './user-details/user-details.component';
import { UpdateUserComponent } from './update-user/update-user.component';
import { ProjectTaskComponent } from './Project_Management/project-task/project-task.component';
import { AddProjectTaskComponent } from './Project_Management/add-project-task/add-project-task.component';
import { ProjectTaskListComponent } from './Project_Management/project-task-list/project-task-list.component';
import { ProjectTaskDetailsComponent } from './Project_Management/project-task-details/project-task-details.component';
import { UpdateProjectTaskComponent } from './Project_Management/update-project-task/update-project-task.component';

@NgModule({
  declarations: [
    AppComponent,
    HomePageComponent,
    FooterPageComponent,
    AddProjectsComponent,
    AllProjectsComponent,
    UserDetailsComponent,
    UpdateUserComponent,
    ProjectTaskComponent,
    AddProjectTaskComponent,
    ProjectTaskListComponent,
    ProjectTaskDetailsComponent,
    UpdateProjectTaskComponent,
    
    
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule
    
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
