package com.qf.testrest_web.controller;

import com.qf.rest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public User test(@PathVariable Long id){
        User user = restTemplate.getForObject("http://localhost:8080/user/"+id,User.class);
        return user;
    }
}
