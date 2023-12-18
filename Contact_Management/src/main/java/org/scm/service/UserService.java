package org.scm.service;

import java.util.List;

import org.scm.entity.User;
import org.scm.exception.UserNotFoundException;

public interface UserService {

	User createUser(User user);

	List<User> getAllUsers();

	void deleteUserByPhone(Long phoneNumber) throws UserNotFoundException;

}
