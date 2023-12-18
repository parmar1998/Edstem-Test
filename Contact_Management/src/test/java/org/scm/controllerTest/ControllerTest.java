package org.scm.controllerTest;

import org.junit.jupiter.api.Test;
import org.scm.controller.UserController;
import org.scm.entity.User;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

@SpringBootTest
public class ControllerTest {

	@MockBean
	private UserController controller;

	@BeforeTestMethod
	public void records_present() {

		User user1 = new User();
		user1.setAddress("Ajmer");
		user1.setPhoneNumber(8999183273l);
		user1.setUserName("Arti");
		user1.setUseremail("Arti@gmail.com");
		controller.createUser(user1);
	}

	@Test
	public void Test_passing_PostingTheUser() {
		User user = new User();
		user.setAddress("Kolkata");
		user.setPhoneNumber(8999183273l);
		user.setUserName("Rahul");
		user.setUseremail("rahul@gmail.com");
		controller.createUser(user);
	}

	@Test
	public void Test_failing_PostUser() {
		User user1 = new User();
		user1.setAddress("Ajmer");
		user1.setPhoneNumber(8999183273l);
		user1.setUserName("Arti");
		user1.setUseremail("Arti@gmail.com");
		controller.createUser(user1);
	}
}
