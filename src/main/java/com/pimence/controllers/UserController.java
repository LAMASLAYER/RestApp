package com.pimence.controllers;

import com.pimence.models.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


@RestController
public class UserController {

    private static final Logger LOGGER = Logger.getLogger(UserController.class);

    @CrossOrigin
    @RequestMapping("/users")
    public List<User> getUser() {
        List<User> users = new ArrayList<User>();
        LOGGER.info("Retrieving Users !");
        users.add(0, new User(1, "Jerome","1234"));
        users.add(1, new User(2, "Zambla", "1234"));
        users.add(2, new User(3, "Licorne", "1234"));
        users.add(3, new User(4, "MrGameAndWatch", "1234"));
        users.add(4, new User(5, "Batman", "1234"));
        return users;
    }

}
