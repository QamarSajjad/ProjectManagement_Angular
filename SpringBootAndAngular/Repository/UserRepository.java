package com.SpringBootAndAngular.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SpringBootAndAngular.Entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>, CrudRepository<UserEntity, Long>   {

           public  Iterable<UserEntity> deleteByName(String name);
           public UserEntity  searchByName(String name);
		   public UserEntity searchBymoNumber(String number);
		
	

}
