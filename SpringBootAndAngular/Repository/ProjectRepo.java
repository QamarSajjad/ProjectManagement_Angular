package com.SpringBootAndAngular.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SpringBootAndAngular.Entity.ProjectEntity;
@Repository
public interface ProjectRepo extends CrudRepository<ProjectEntity, Long>, JpaRepository<ProjectEntity, Long>  {

//	ProjectEntity searchBymoNumbers(String moNumber);

//	ProjectEntity searchBymoNumbers(String project_Name);

//	ProjectEntity searchBymoNumbers(String moNumber);

}
