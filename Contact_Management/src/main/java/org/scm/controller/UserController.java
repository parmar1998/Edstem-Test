package org.scm.controller;

import java.util.List;

import org.scm.entity.User;
import org.scm.exception.UserNotFoundException;
import org.scm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// registering in the container controller class
@RestController
// A common path for the Application - /users
@RequestMapping("/users")
public class UserController {
// Service Autowiring 
	@Autowired
	private UserService service;

//	Creating a Contact	
	@PostMapping("/")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		service.createUser(user);
		return ResponseEntity.ok(user);
	}
//	Getting all contact
	@GetMapping("/")
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> users = service.getAllUsers();
		return ResponseEntity.ok(users);
	}

//	Deleting a specific contact
//	Deleting by ID
	@DeleteMapping("userPhone/{phoneNumber}")
	public ResponseEntity<String> deleteUser(@PathVariable Long phoneNumber) throws UserNotFoundException {
		service.deleteUserByPhone(phoneNumber);
		return ResponseEntity.ok("User Deleted Successfully");
	}

}
