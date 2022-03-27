import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';


//UserDefined Imports..
import { HomePageComponent } from './home-page/home-page.component';
import { AddProjectsComponent } from './add-projects/add-projects.component';
import { AllProjectsComponent } from './all-projects/all-projects.component';




const routes: Routes = [

  {path: 'add-Projects',component: AddProjectsComponent },
  // {path: 'add-Projects', component: AddProjectsComponent },
  {path: 'all-Projects', component: AllProjectsComponent }


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
