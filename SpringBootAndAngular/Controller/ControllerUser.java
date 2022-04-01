package com.SpringBootAndAngular.Controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootAndAngular.Entity.UserEntity;
import com.SpringBootAndAngular.Repository.UserRepository;
import com.mysql.cj.protocol.x.Ok;

@RestController
public class ControllerUser {

	@Autowired
	UserRepository userRepo;


	@GetMapping("/home")
	public String home() {
		return "This is initial home  page.. ";
	}

	@PostMapping("/addUser")
	@CrossOrigin
	public String addUser(@RequestBody UserEntity entity) {
		System.out.println("UserAdded");
		userRepo.save(entity);
		return "Hello" + entity.getName() + "your registration is successfull...";
	}

	@GetMapping("/getUser/{id}")
	@CrossOrigin
	public Optional<UserEntity> getUser(@PathVariable long id) {
//		System.out.println(userRepo.findById(id));
//		int userId= Integer.parseInt(id);
		return userRepo.findById(id);
	}

	@GetMapping("/getUsers")
	@CrossOrigin
	public List<UserEntity> AllUsers() {
		return userRepo.findAll();
	}

	@GetMapping("/searchUser/{id}")
	@CrossOrigin
	public Optional<UserEntity> searchUser(@PathVariable long id, UserEntity entity) {
		System.out.println("name is : " + userRepo.findById(id));
		return userRepo.findById(id);
//		 "" + entity.getName();
	}

	@GetMapping("/searchUser/{moNumber}")
	public UserEntity searchUserByNumber(@PathVariable String moNumber) {
//		System.out.println("name is : "+userRepo.searchByName(name));
		return userRepo.searchBymoNumber(moNumber);

	}

	@GetMapping("/searchUser/{name}")
	public UserEntity searchUserByName(@PathVariable String name) {
//		System.out.println("name is : "+userRepo.searchByName(name));
		return userRepo.searchBymoNumber(name);
	}

	@DeleteMapping("/deleteUser/{id}")
	@CrossOrigin
	public List<UserEntity> deleteUser(@PathVariable long id) {
		userRepo.deleteById(id);
		return userRepo.findAll();

	}

	@PutMapping("/editUser/{id}")
	@CrossOrigin
	public UserEntity replaceEmployee(@RequestBody UserEntity userEntity, @PathVariable long id) {
//			UserEntity entiti=new UserEntity();
		return userRepo.findById(id).map(entity -> {
			entity.setName(userEntity.getName());
			entity.setMoNumber(userEntity.getMoNumber());
			entity.setAddress(userEntity.getAddress());
			return userRepo.save(entity);
		}).orElseGet(() -> {
			userEntity.setId(id);
			return userRepo.save(userEntity);
		});
	}

}
