package in.codecrescendo.blog.service;

import in.codecrescendo.blog.entity.User;
import in.codecrescendo.blog.wrapper.input.UserInputWrapper;

public interface IUserService {
	public User saveUser(UserInputWrapper user);
	
	public User findById(int userId);
	public void deleteById(int userId);
	
	public User findByName(String userName);
	
	public User updateByName(String userName, UserInputWrapper user);
}
