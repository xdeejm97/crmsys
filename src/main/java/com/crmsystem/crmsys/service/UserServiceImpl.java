package com.crmsystem.crmsys.service;

import com.crmsystem.crmsys.model.User;
import com.crmsystem.crmsys.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public User findByName(String username) {
        return userRepository.findByName(username);
    }
}
