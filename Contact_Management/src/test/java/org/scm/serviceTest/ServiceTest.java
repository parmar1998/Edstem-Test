package org.scm.serviceTest;

import org.junit.jupiter.api.Test;
import org.scm.exception.UserNotFoundException;
import org.scm.service.UserServiceImpl;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class ServiceTest {

	@MockBean
	private UserServiceImpl impl;

	@Test
	public void test_for_deletingtheUser(Long phoneNumber) throws UserNotFoundException {
		Long phoneNumberT = 564781191l;
		impl.deleteUserByPhone(phoneNumberT);
	}

}
