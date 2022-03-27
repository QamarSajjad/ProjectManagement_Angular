import { Injectable } from '@angular/core';
import  {HttpClient}  from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProjectServiceService {

  constructor(private http : HttpClient) {

}
// ADD USER
   doRegister(user: any){
     console.log(user);
     return this.http.post("http://localhost:8080/addUser",user,{ responseType: "text" as "json" });

  }

  //FIND ALL USER
  allUser(){
    return this.http.get("http://localhost:8080/getUsers");
    console.log();
     }

//DELETE USER
deleteUser(id:any){
  return this.http.get("http://localhost:8080/deleteUser/"+id);

}
}
