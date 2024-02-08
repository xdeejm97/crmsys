package com.crmsystem.crmsys.repository;

import com.crmsystem.crmsys.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User save(User user);
    List<User> findAll();
    User findById(long id);
    User findByName(String name);
    void delete(User user);


}
