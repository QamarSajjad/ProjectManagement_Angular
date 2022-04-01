package com.SpringBootAndAngular.Entity;

import java.sql.Date;
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
@Table(name="taskEntity")
public class TaskEntity  {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long task_id;
	private String task_name;
	private String task_created_at;
	
	String localDate = LocalDate.now().toString();	
	public String getLocalDate() {
		return localDate;
	}
	public void setLocalDate(String localDate) {
		this.localDate = localDate;
	}
	public String getLocalTime() {
		return localTime;
	}
	public void setLocalTime(String localTime) {
		this.localTime = localTime;
	}
	String localTime = LocalTime.now().toString();

	
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private UserEntity userEntity;
	
	public long getTask_id() {
		return task_id;
	}
	public void setTask_id(long task_id) {
		this.task_id = task_id;
	}
	public String getTask_name() {
		return task_name;
	}
	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}
	public String getTask_created_at() {
		return task_created_at;
	}
	public void setTask_created_at(String task_created_at) {
		this.task_created_at = task_created_at;
	}
	public UserEntity getUserEntity() {
		return userEntity;
	}
	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}
	public TaskEntity(long task_id, String task_name, String task_created_at, UserEntity userEntity) {
		super();
		this.task_id = task_id;
		this.task_name = task_name;
		this.task_created_at = task_created_at;
		this.userEntity = userEntity;
	}
	public TaskEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TaskEntity [task_id=" + task_id + ", task_name=" + task_name + ", task_created_at=" + task_created_at
				+ ", localDate=" + localDate + ", localTime=" + localTime + ", userEntity=" + userEntity + "]";
	}
	
	
	
	
	
	
	
	
	
}
