import { Injectable } from '@angular/core';
import  {HttpClient, HttpContext, HttpHeaders, HttpParams}  from '@angular/common/http';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class ProjectServiceService {
  // status: { headers?: HttpHeaders | { [header: string]: string | string[]; } | undefined; context?: HttpContext | undefined; observe?: "body" | undefined; params?: HttpParams | { [param: string]: string | number | boolean | readonly (string | number | boolean)[]; } | undefined; reportProgress?: boolean | undefined; responseType: "arraybuffer"; withCredentials?: boolean | undefined; };

  constructor(private http : HttpClient) {
status:true;
}
// ADD USER
   doRegister(user: User){
     console.log(user);
     return this.http.post("http://localhost:8080/addUser",user,{ responseType: "text" as "json" });

  }

  //FIND ALL USER
  allUser(){
    return this.http.get("http://localhost:8080/getUsers");
    console.log();
     }

//DELETE USER
deleteUser(id:number){
  console.log(id);
  return this.http.delete("http://localhost:8080/deleteUser/"+id);
}

// VIEW_DETAILS
viewUserDetails(id:number){
  console.log(id);
  return this.http.get("http://localhost:8080/getUser/"+id);
}

//UPDATE USER
updateUser(id:number,user: User){
  console.log(id);
  return this.http.put("http://localhost:8080/editUser/"+id,user);
}
  
//SEARCH USER
searchUser(id:number){
return this.http.get("http://localhost:8080/searchUser/"+id)

}




}
