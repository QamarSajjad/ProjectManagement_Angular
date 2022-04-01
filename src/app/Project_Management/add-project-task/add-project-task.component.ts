import { AfterViewInit, Component, OnInit } from '@angular/core';
import { User } from 'src/app/user';
import { ProjectManagementServiceService } from '../project-management-service.service';
import { TaskEntity } from '../taskList';

// ----------------
// import { ViewChild, AfterViewInit } from ‘@angular/core’;


@Component({
  selector: 'app-add-project-task',
  templateUrl: './add-project-task.component.html',
  styleUrls: ['./add-project-task.component.css']
})
export class AddProjectTaskComponent implements OnInit{
  
  message:any;
  taskEntity: TaskEntity = new TaskEntity();
  userEntity:  any
  // userEntity!: User;
 

  constructor(private p_m_service: ProjectManagementServiceService) { }
  
 
  ngOnInit(): void {
  }

addProjectTasks(){
this.p_m_service.addProjectTask(this.taskEntity).subscribe( res=>{
  console.log(res);
//  this.message=res  
//  console.log(this.message);
 
//  console.log(res);
//  this.users=res;
//  console.log("user"+this.user);
 

 
 
// console.log(res);
// this.message=res;



})

  }

}
