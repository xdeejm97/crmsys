package com.crmsystem.crmsys.controller;

import com.crmsystem.crmsys.model.User;
import com.crmsystem.crmsys.service.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/home")
    public String get(){
        return "Hello!";
    }

//    @PostMapping("/{a}/{b}")
    @RequestMapping(value = "/test/{a}/{b}", method = {RequestMethod.GET, RequestMethod.POST})
    public void save(@PathVariable("a") String name, @PathVariable("b") String sun){

        User user = new User();
        user.setName(name);
        user.setSurname(sun);
        userService.save(user);

    }



}
