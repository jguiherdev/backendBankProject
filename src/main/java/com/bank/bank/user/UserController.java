package com.bank.bank.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value="/users")
	public List<Userr> getAllUsers() {
		return userService.getAllUsers();
	}

	@RequestMapping(value = "/users/{id}")
	public Userr getUser(@PathVariable String id) {
	return userService.getUser(id);
	}

	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public void addUser(@RequestBody Userr user) {
		userService.addUser(user);
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
	public void updateUser(@RequestBody Userr user, @PathVariable String id) {
	userService.updateUser(id, user);
	}

	@RequestMapping(value = "/users/login", method = RequestMethod.POST)
	public String login(@RequestBody String email, String password) {
		return "user logged in";
	}
	
}
