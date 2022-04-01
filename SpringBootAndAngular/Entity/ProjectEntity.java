package com.SpringBootAndAngular.Entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ProjectEntities")
public class ProjectEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long project_Id;
	private  String project_Name;
	private  String project_created_By;
	private  String projectDescription;
	private String currentDate=LocalDate.now().toString();
	private String curentTime= LocalTime.now().toString();
	
	@OneToOne(cascade = CascadeType.ALL)
	TaskEntity taskEntity;
	
	
	public TaskEntity getTaskEntity() {
		return taskEntity;
	}
	public void setTaskEntity(TaskEntity taskEntity) {
		this.taskEntity = taskEntity;
	}
	public long getProject_Id() {
		return project_Id;
	}
	public void setProject_Id(long project_Id) {
		this.project_Id = project_Id;
	}
	public String getProject_Name() {
		return project_Name;
	}
	public void setProject_Name(String project_Name) {
		this.project_Name = project_Name;
	}
	public String getProject_created_By() {
		return project_created_By;
	}
	public void setProject_created_By(String project_created_By) {
		this.project_created_By = project_created_By;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	public String getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}
	public String getCurentTime() {
		return curentTime;
	}
	public void setCurentTime(String curentTime) {
		this.curentTime = curentTime;
	}
	public ProjectEntity(long project_Id, String project_Name, String project_created_By, String projectDescription,
			String currentDate, String curentTime) {
		super();
		this.project_Id = project_Id;
		this.project_Name = project_Name;
		this.project_created_By = project_created_By;
		this.projectDescription = projectDescription;
		this.currentDate = currentDate;
		this.curentTime = curentTime;
	}
	public ProjectEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ProjectEntity [project_Id=" + project_Id + ", project_Name=" + project_Name + ", project_created_By="
				+ project_created_By + ", projectDescription=" + projectDescription + ", currentDate=" + currentDate
				+ ", curentTime=" + curentTime + ", taskEntity=" + taskEntity + "]";
	}
	
	
}