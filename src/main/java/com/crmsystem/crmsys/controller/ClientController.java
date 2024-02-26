package com.crmsystem.crmsys.controller;

import com.crmsystem.crmsys.model.Client;
import com.crmsystem.crmsys.service.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClientController {

    @Autowired
    private ClientServiceImpl clientService;

    @RequestMapping(value = "/client/add/{name}", method = {RequestMethod.GET, RequestMethod.POST})
    public String save(@PathVariable("name") String name){

        Client client = new Client();
        client.setName(name);
        clientService.save(client);
        return "Client has been added";
    }

    @RequestMapping(value = "/client/delete/{id}", method = {RequestMethod.GET, RequestMethod.DELETE})
    public void delete(@PathVariable("id") Long id) {

        clientService.deleteClient(id);

    }
}
