package in.codecrescendo.blog.service;

import in.codecrescendo.blog.entity.User;
import in.codecrescendo.blog.wrapper.input.UserInputWrapper;

public interface IUserService {
	User saveUser(UserInputWrapper user);
}
