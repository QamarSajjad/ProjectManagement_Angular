package com.SpringBootAndAngular.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SpringBootAndAngular.Entity.TaskEntity;

@Repository
public interface Project_Task_Repo extends CrudRepository<TaskEntity, Long>, JpaRepository<TaskEntity, Long> {

}
