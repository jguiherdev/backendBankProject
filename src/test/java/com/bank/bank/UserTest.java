package com.bank.bank;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.bank.bank.user.UserService;
import com.bank.bank.user.Userr;

@SpringBootTest
class UserTest {

	@Test
	void contextLoads() {
	}

	@Test
	void getAllUsersTest() {
		UserService userService = new UserService();
		userService.getAllUsers();
		assertTrue(userService.getAllUsers().size()==3);
	}

	@Test
	void getUserTest() {
		UserService userService = new UserService();
		userService.getUser("1");
		assertTrue(userService.getUser("1").getId().equals("1"));
	}

	@Test
	void addUserTest() {
		UserService userService = new UserService();
		userService.addUser(new Userr(
				"4","alberto","garcia", "alberto@alberto.com", "tikitiki", "695874532", new ArrayList<String>(Arrays.asList("7","8"))));
		assertTrue(userService.getAllUsers().size()==4);
	}

}
