package com.crmsystem.crmsys.repository;

import com.crmsystem.crmsys.model.Client;
import com.crmsystem.crmsys.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {


    Client save(Client client);

    List<Client> findAll();

    Optional<Client> findById(Long aLong);

    Client findByName(Client client);

    void delete(Client client);

}
