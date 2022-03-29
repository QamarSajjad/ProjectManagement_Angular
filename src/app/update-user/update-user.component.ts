import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ProjectServiceService } from '../project-service.service';
import {User} from "../user";

@Component({
  selector: 'app-update-user',
  templateUrl: './update-user.component.html',
  styleUrls: ['./update-user.component.css']
})
export class UpdateUserComponent implements OnInit {

  userDetails:any;
  message: any | undefined;
  user1: User = new User();
  constructor(private route:ActivatedRoute,private router:Router,
   private  userService:ProjectServiceService) { }
  
  ngOnInit(): void {
  
    this.route.paramMap.subscribe(param =>{
      console.log();
      // let parId :any= param.get('id')\
      let parId :any= param.get('id')

      
      this.userService.viewUserDetails(parId).subscribe(res=>{
        console.log(res);
        console.log( this.userDetails);
        
        this.userDetails=res;
       
        
      })
    
    })

   
 }

 public updateUser(){
  let result =this.userService.updateUser(this.userDetails.id,this.userDetails)
  result.subscribe( data =>{
  console.log(data);
 this.message = data;
 this.router.navigate(['/all-Projects']);

  

  })
} 

}
