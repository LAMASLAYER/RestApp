package com.restapp.controllers;


import com.restapp.repositories.UserRepository;
import com.restapp.models.Users;
import com.restapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.apache.log4j.Logger;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {

    private static final Logger LOGGER = Logger.getLogger(UserController.class);

    private final UserRepository userRepository;
    private final UserService userService;

    @Autowired
    public UserController(UserRepository ur, UserService userService) {
        this.userRepository = ur;
        this.userService = userService;
    }

    @RequestMapping("/getUsers")
    @ResponseBody
    public List<Users> getAllUsers() {
        LOGGER.info("Retrieving users...");
        return userRepository.findAll();
    }



    @RequestMapping("/{user_id}")
    public Users getUserById(@PathVariable Integer user_id) {
        return userService.getUserById(user_id);
    }

    @RequestMapping("/post")
    public void saveUser(@RequestBody Users user) {
            userService.saveUser(user);
    }

}
