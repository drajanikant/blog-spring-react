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

    @PostMapping
    public User saveUser(@RequestBody UserInputWrapper user){
        return  userService.saveUser(user);
    }
}
