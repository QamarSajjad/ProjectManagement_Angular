import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from '../user';
import { TaskEntity } from './taskList';

@Injectable({
  providedIn: 'root'
})
export class ProjectManagementServiceService {

  constructor(private http :HttpClient) { }

  allTaskList(){
    return this.http.get("http://localhost:8080/getAllTask");
    console.log();
     }

     addProjectTask(taskEntity:TaskEntity){
      return this.http.post("http://localhost:8080/addTask",taskEntity,{ responseType: "text" as "json" });


     }
}
