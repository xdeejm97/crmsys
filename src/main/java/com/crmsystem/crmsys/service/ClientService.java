package com.crmsystem.crmsys.service;

import com.crmsystem.crmsys.model.Client;
import com.crmsystem.crmsys.model.User;

public interface ClientService {

    void save(Client client);
    Client findByName(String username);

}
