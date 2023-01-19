package com.unir.backend.services;

import com.unir.backend.entities.UserEntity;
import com.unir.backend.models.Dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    public UserDto createUser(UserDto userDto);
    public List<UserEntity> getAll();
    public UserDto getUser(String email);

}
