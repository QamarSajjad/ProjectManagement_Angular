package com.SpringBootAndAngular.Controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootAndAngular.Entity.TaskEntity;
import com.SpringBootAndAngular.Repository.Project_Task_Repo;
import com.SpringBootAndAngular.Repository.UserRepository;

@RestController
public class Task_Controller {

	@Autowired
	Project_Task_Repo projectTask_Reposit;

	@GetMapping("/TaskControllerhome")
	public String home() {
		LocalDate localDate = LocalDate.now();	
		LocalTime localTime = LocalTime.now();

		System.out.println(localDate);
		return "This is initial TaskController home  page.. "+localDate+" "+"-"+localTime;
	}

    @PostMapping("/addTask")
    @CrossOrigin
	public String addProjectTask(@RequestBody TaskEntity taskEntity) {
	 projectTask_Reposit.save(taskEntity);
	 return "Congratulation's" + taskEntity.getTask_name()+ "Task Added successFully.."+taskEntity.toString();
	}

	@GetMapping("/getAllTask")
	@CrossOrigin
	public List<TaskEntity> allTaskLists() {
		return projectTask_Reposit.findAll();

	}

}
