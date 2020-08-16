package in.codecrescendo.blog.controller;

import in.codecrescendo.blog.entity.User;
import in.codecrescendo.blog.service.IUserService;
import in.codecrescendo.blog.wrapper.input.UserInputWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private IUserService userService;

	@PostMapping(value = "/saveUser")
	public User saveUser(@RequestBody UserInputWrapper user) {
		return userService.saveUser(user);
	}

	@GetMapping(value = "/{userId}")
	public User findById(@PathVariable int userId) {
		return userService.findById(userId);

	}
	
	@DeleteMapping(value = "/{userId}")
	public void deleteById(@PathVariable int userId) {
		 userService.deleteById(userId);

	}
	
	@PostMapping(value = "/update/{userName}")
	public User updateUser(@PathVariable String userName, @RequestBody UserInputWrapper userObj) {
		return userService.updateByName(userName, userObj);
		
	}
}
