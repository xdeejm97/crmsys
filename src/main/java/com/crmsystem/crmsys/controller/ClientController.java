package com.crmsystem.crmsys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @GetMapping("/client")
    public String getHome(){
        return "Hello!";
    }

}
