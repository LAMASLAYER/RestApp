package com.pimence.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("/")
    public String index(){
        //mapped to hostname:port/home/index/
            return "Welcome on Pimence back-end."
                    + "<br/>"
                    + "See users: "
                    + "<a href='/users'>Users</a><br/>";
        }
}
