package in.codecrescendo.blog.service;


import in.codecrescendo.blog.dao.UserRepository;
import in.codecrescendo.blog.wrapper.input.UserInputWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codecrescendo.blog.entity.User;

@Service
public class UserService implements IUserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(UserInputWrapper _user) {
		User user =new User();
		user.setUserName(_user.getUser_name());
		user.setUserEmail(_user.getUser_email());
		user.setUserPassword(_user.getUser_password());
		user.setUserRole(_user.getUser_role());
		user.setStatus("Active");
		return userRepository.save(user);
	}

	@Override
	public User findById(int userId) {
		User user=userRepository.findById(userId).get();
		return user;
	}

	public void deleteById(int userId) {

		userRepository.deleteById(userId);

	}

	@Override
	public User updateByName(String userName,UserInputWrapper userObj) {
//		userRepository.fin
		User user=findByName(userName);
		user.setUserName(userObj.getUser_name());
		user.setUserEmail(userObj.getUser_email());
		user.setUserPassword(userObj.getUser_password());
		user.setUserRole(userObj.getUser_role());
		user.setStatus("Active");
		return userRepository.save(user);
	}

	@Override
	public User findByName(String userName) {
		return userRepository.findByName(userName);
	}


}