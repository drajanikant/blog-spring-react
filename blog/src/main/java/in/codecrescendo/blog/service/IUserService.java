package in.codecrescendo.blog.service;

import in.codecrescendo.blog.entity.User;
import in.codecrescendo.blog.wrapper.input.UserInputWrapper;

public interface IUserService {
	User saveUser(UserInputWrapper user);

	User findById(int userId) throws Exception;

	void deleteById(int userId) throws Exception;

	User findByName(String userName);

	User updateByName(String userName, UserInputWrapper user);
}