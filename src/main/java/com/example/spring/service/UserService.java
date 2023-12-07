package com.example.spring.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.spring.entity.User;
import com.example.spring.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void registerUser(User user) {
        userRepository.save(user);
    }
    @Transactional(readOnly = true)
    public User findUserById(Long id) {
        return userRepository.findUserById(id);
    }
}
