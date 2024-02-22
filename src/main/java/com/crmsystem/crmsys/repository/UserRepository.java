package com.crmsystem.crmsys.repository;

import com.crmsystem.crmsys.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User save(User user);
    List<User> findAll();
    Optional<User> findById(Long aLong);
    User findByName(String username);
    void delete(User user);


}
