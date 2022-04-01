import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/user';
import { ProjectManagementServiceService } from '../project-management-service.service';
import { TaskEntity } from '../taskList';

@Component({
  selector: 'app-project-task-list',
  templateUrl: './project-task-list.component.html',
  styleUrls: ['./project-task-list.component.css']
})
export class ProjectTaskListComponent implements OnInit {
  userEntity!: User;
  users :any;
 
  constructor(private p_m_service: ProjectManagementServiceService) { }

  taskEntities:any 
  // TaskEntity=new TaskEntity();   
  // taskList:any;
  ngOnInit(): void {

    this.p_m_service.allTaskList().subscribe(res=>{
      //  console.log(  this.taskEntities=res);
      //  this.taskEntities =res;
      this.taskEntities=res;
      console.log(res);
      // console.log(this.taskEntities);
      
    
    



    })

  }

}
