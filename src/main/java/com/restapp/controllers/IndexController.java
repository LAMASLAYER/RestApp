package com.restapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("/")
    public String index(){
        //mapped to hostname:port/home/index/
            return "Welcome on RestApp back-end."
                    + "<br/>"
                    + "See users: "
                    + "<a href='/users/getUsers'>Users</a><br/>"
                    + "See assets URLs: "
                    + "<a href='/assets/get'>Assets</a><br/>";
        }
}
