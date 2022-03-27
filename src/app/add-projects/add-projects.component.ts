import { Component, OnInit } from '@angular/core';
import { ProjectServiceService } from '../project-service.service';
import {User} from "../user";
@Component({
  selector: 'app-add-projects',
  templateUrl: './add-projects.component.html',
  styleUrls: ['./add-projects.component.css']
})
export class AddProjectsComponent implements OnInit {

  constructor(private userService : ProjectServiceService) {  }

  user: User = new User();
  message :any;
 
   ngOnInit(): void {
   }
 
   public addUsers(){
     let result =this.userService.doRegister(this.user)
     result.subscribe( data =>{
     console.log(data);
    this.message = data;
 
     
 
     })
   } 
 
}
