package com.SpringBootAndAngular.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.SpringBootAndAngular.Entity.ProjectEntity;
import com.SpringBootAndAngular.Entity.UserEntity;
import com.SpringBootAndAngular.Repository.ProjectRepo;

public class ProjectController {

	
@Autowired
ProjectRepo projectRepo;
	@GetMapping("/home")
	public String home() {
		return "This is initial home  page.. ";
	}

	@PostMapping("/addProject")
	@CrossOrigin
	public String addUser(@RequestBody ProjectEntity project_entity) {
		System.out.println("UserAdded");
		projectRepo.save(project_entity);
		return "Hello" + project_entity.getProject_Name() + "your registration is successfull...";
	}

	@GetMapping("/getProject/{id}")
	@CrossOrigin
	public Optional<ProjectEntity> getUser(@PathVariable long project_id) {
//		System.out.println(userRepo.findById(id));
//		int userId= Integer.parseInt(id);
		return projectRepo.findById(project_id);
	}

	@GetMapping("/getAllProjects")
	@CrossOrigin
	public List<ProjectEntity> AllUserss() {
		return projectRepo.findAll();
	}

	@GetMapping("/searchProject/{id}")
	@CrossOrigin
	public Optional<ProjectEntity> searchUser(@PathVariable long project_id, ProjectEntity projctentity) {
		System.out.println("name is : " + projectRepo.findById(project_id));
		return projectRepo.findById(project_id);
//		 "" + entity.getName();
	}
//
//	@GetMapping("/searchUser/{moNumber}")
//	public ProjectEntity searchUserByNumber(@PathVariable String moNumber) {
////		System.out.println("name is : "+userRepo.searchByName(name));
//		return projectRepo.searchBymoNumbers(moNumber);
//
//	}
//
//	@GetMapping("/searchUser/{name}")
//	public ProjectEntity searchUserByprojectName(@PathVariable String project_Name) {
////		System.out.println("name is : "+userRepo.searchByName(name));
//		return projectRepo.searchBymoNumbers(project_Name);
//	}

	@DeleteMapping("/deleteProject/{id}")
	@CrossOrigin
	public List<ProjectEntity> deleteUser(@PathVariable long project_id) {
		projectRepo.deleteById(project_id);
		return projectRepo.findAll();

	}

	@PutMapping("/editProject/{id}")
	@CrossOrigin
	public ProjectEntity replaceEmployee(@RequestBody ProjectEntity projectEntity, @PathVariable long project_id) {
//			UserEntity entiti=new UserEntity();
		return projectRepo.findById(project_id).map(entity -> {
			entity.setProject_Name(projectEntity.getProject_Name());
			entity.setProjectDescription(projectEntity.getProjectDescription());
			entity.setProject_created_By(projectEntity.getProject_created_By());
			entity.setCurentTime(projectEntity.getCurentTime());
			entity.setCurrentDate(projectEntity.getCurrentDate());
			
			return projectRepo.save(entity);
		}).orElseGet(() -> {
			projectEntity.setProject_Id(project_id);
			return projectRepo.save(projectEntity);
		});
	}

	
	
	
	
}
