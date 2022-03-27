import { NUMBER_TYPE } from '@angular/compiler/src/output/output_ast';
import { Component, OnInit } from '@angular/core';
import { ProjectServiceService } from '../project-service.service';
import { User } from '../user';

@Component({
  selector: 'app-all-projects',
  templateUrl: './all-projects.component.html',
  styleUrls: ['./all-projects.component.css']
})
export class AllProjectsComponent implements OnInit {

  constructor(private userService : ProjectServiceService) {  }

  user: User = new User();
 users :any;
 markId:any;
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

public removeUser(id:any){
 let result=this.userService.deleteUser(id)
 result.subscribe( data =>{
this.message=data
console.log(this.users.id);
})
}

// chechBox 
checkedAndUnChecked:boolean | undefined;
// userArray: [] | undefined;


iid:number | undefined;

public markDeleteUser(evnt:any,id:number){
  var userArray: number[]= [];
  this.iid=id;
 
//  console.log(evnt.target.checked);
 this.checkedAndUnChecked=evnt.target.checked;
 if( this.checkedAndUnChecked==true){
  userArray?.push(this.iid);
   console.log(userArray);
  //  console.log(this.checkedAndUnChecked);
// this.userArray=id;
// console.log(this.userArray);
 }else if(this.checkedAndUnChecked==false){
     userArray?.splice(this.iid);
     console.log(userArray);
     
  
   
 }

 


  // console.log(id);
  
//   let result=this.userService.markAllUser()
//  console.log(id);
//  this.markId=id;

  }
  

}



