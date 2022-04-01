import { NUMBER_TYPE } from '@angular/compiler/src/output/output_ast';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ProjectServiceService } from '../project-service.service';
import { User } from '../user';

@Component({
  selector: 'app-all-projects',
  templateUrl: './all-projects.component.html',
  styleUrls: ['./all-projects.component.css']
})
export class AllProjectsComponent implements OnInit {
 

  constructor(private userService : ProjectServiceService,private rout:ActivatedRoute,
    private router:Router) {  }
 
   markdeleteUser: [] = [];
  user: User = new User();
  // markdeleteUser: User = new User();
 users :any;
 markId:number | undefined;
 userId:string | undefined;

 message:any
  ngOnInit(): void {
    this.allUsers();
  }

  public allUsers(){
   let result= this.userService.allUser().subscribe( data => 
    this.users = data)
     console.log(this.users);
    } 

public removeUser(id:number){
 let result=this.userService.deleteUser(id)
 result.subscribe( data =>{
this.message=data
console.log(this.message.id);
this.allUsers();
})
}

searchUser(refname:any){
console.log(refname.name);

}
// searchUsers(id: number){
//   console.log(id);
//   this.userService.searchUser(id).subscribe(res=>{
//    console.log(res);


//   })
  
// }




}
      
          





