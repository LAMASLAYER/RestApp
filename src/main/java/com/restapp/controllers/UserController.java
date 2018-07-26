package com.restapp.controllers;

import com.restapp.interfaces.IUser;
import com.restapp.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.apache.log4j.Logger;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {

    private static final Logger LOGGER = Logger.getLogger(UserController.class);

    @Autowired
    IUser ur;

    @RequestMapping("/getUsers")
    @ResponseBody
    public List<Users> getAllUsers() {
        LOGGER.info("Retrieving users...");
        return ur.findAll();
    }

}
