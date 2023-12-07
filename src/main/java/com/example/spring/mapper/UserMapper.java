package com.example.spring.mapper;


import lombok.Setter;
import org.springframework.stereotype.Component;
import com.example.spring.dto.UserDTO;
import com.example.spring.entity.User;

@Setter
public class UserMapper {

    public UserDTO userToUserDTO(User user) {
        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setName(user.getName());
        return dto;
    }

    public User userDTOToUser(UserDTO dto) {
        User user = new User();
        user.setId(dto.getId());
        user.setName(dto.getName());
        return user;
    }
}
