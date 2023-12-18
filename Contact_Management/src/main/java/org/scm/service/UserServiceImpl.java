package org.scm.service;

import java.util.List;

import org.scm.entity.User;
import org.scm.exception.UserNotFoundException;
import org.scm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;

	@Override
	public User createUser(User user) {
//		Building the Object we get from the user in requestbody
		User nUser = new User();
		nUser.setAddress(user.getAddress());
		nUser.setPhoneNumber(user.getPhoneNumber());
		nUser.setUseremail(user.getUseremail());
		nUser.setUserName(user.getUserName());
//		Calling out the jpa repository method
		repository.save(user);

		return nUser;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = repository.findAll();
		return users;
	}

	@Override
	public void deleteUserByPhone(Long phoneNumber) throws UserNotFoundException {
		repository.deleteById(phoneNumber);
	}

}
