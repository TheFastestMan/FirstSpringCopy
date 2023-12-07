package com.example.spring.service;

import com.example.spring.dto.UserDTO;
import com.example.spring.entity.User;
import com.example.spring.mapper.UserMapper;
import com.example.spring.repository.UserRepository;
import lombok.Setter;


public class UserService {
    private UserRepository userRepository;
    private UserMapper userMapper;

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public void registerUser(UserDTO userDTO) {
        User user = userMapper.userDTOToUser(userDTO);
        userRepository.save(user);
    }

    public User findUserById(Long id) {
        return userRepository.findUserById(id);
    }
}
