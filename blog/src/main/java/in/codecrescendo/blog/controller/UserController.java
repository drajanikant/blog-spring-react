package in.codecrescendo.blog.controller;

import in.codecrescendo.blog.dao.UserRepository;
import in.codecrescendo.blog.entity.User;
import in.codecrescendo.blog.service.IUserService;
import in.codecrescendo.blog.wrapper.input.UserInputWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private IUserService userService;

    @Autowired
    private UserRepository userRepository;

    @PostMapping()
    public User saveUser(@RequestBody UserInputWrapper user) {
        return userService.saveUser(user);
    }

    @GetMapping(value = "/{userId}")
    public User findById(@PathVariable int userId) throws Exception {
        return userService.findById(userId);
    }
  

    @PutMapping(value = "/{userName}")
    public User updateUser(@PathVariable String userName, @RequestBody UserInputWrapper userObj) {
        return userService.updateByName(userName, userObj);
    }

    @GetMapping
    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(user -> {
             users.add(user);
        });
        return users;
    }
}