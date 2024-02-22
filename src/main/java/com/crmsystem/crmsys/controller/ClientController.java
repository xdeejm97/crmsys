package com.crmsystem.crmsys.controller;

import com.crmsystem.crmsys.service.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    private ClientServiceImpl clientService;

    @GetMapping("/client")
    public String getHome(){
        return "Hello!";
    }

}
