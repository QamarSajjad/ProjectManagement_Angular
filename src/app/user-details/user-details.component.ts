import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ProjectServiceService } from '../project-service.service';
import { User } from '../user';

@Component({
  selector: 'app-user-details',
  templateUrl: './user-details.component.html',
  styleUrls: ['./user-details.component.css']
})
export class UserDetailsComponent implements OnInit {
  userDetails:any;

  constructor(private route:ActivatedRoute,private router:Router,
   private  userService:ProjectServiceService) { }
  
  ngOnInit(): void {
  
    this.route.paramMap.subscribe(param =>{
      console.log();
      let parId :any= param.get('id')
      
      this.userService.viewUserDetails(parId).subscribe(res=>{
        console.log(res);
        console.log( this.userDetails);
        
        this.userDetails=res;
       
        
      })
    
    })

   
 }

 


}
