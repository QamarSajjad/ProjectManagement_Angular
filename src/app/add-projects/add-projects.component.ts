import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ProjectServiceService } from '../project-service.service';
import {User} from "../user";
@Component({
  selector: 'app-add-projects',
  templateUrl: './add-projects.component.html',
  styleUrls: ['./add-projects.component.css']
})
export class AddProjectsComponent implements OnInit {

  constructor(private userService : ProjectServiceService,private route:ActivatedRoute,
    private router:Router) {  }

  user: User = new User();
  // userDetails:any
  message :any;
 
   ngOnInit(): void {
    //  this.route.paramMap.subscribe(param=>{
    //  console.log(param);
    //  let paramId :any= param.get('id')

    //  this.userService.updateUser(paramId).subscribe( res=>{
    //  console.log( this.userDetails=res);

    //  this.userDetails=res;
    //  })


    //  })
   }
 
   public addUsers(){
     let result =this.userService.doRegister(this.user)
     result.subscribe( data =>{
     console.log(data);
    this.message = data;
 
     
 
     })
   } 
 
}
