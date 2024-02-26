package com.crmsystem.crmsys.service;

import com.crmsystem.crmsys.model.Client;
import com.crmsystem.crmsys.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public void save(Client client) {
        clientRepository.save(client);
    }

    @Override
    public Client findByName(String username) {
        return clientRepository.findByName(username);
    }

    @Override
    public void deleteById(Client along) {

    }
    public void deleteClient(Long id){
        clientRepository.deleteById(id);
    }


}
