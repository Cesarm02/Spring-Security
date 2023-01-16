package com.unir.backend.controllers;

import com.unir.backend.entities.UserEntity;
import com.unir.backend.models.Dto.UserDto;
import com.unir.backend.models.response.UserRest;
import com.unir.backend.models.request.UserDetail;
import com.unir.backend.repositories.UserRepository;
import com.unir.backend.services.UserServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserServiceImpl userService;
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String getUser(){
        return "get Users details";
    }

    @PostMapping
    public UserRest createUser(@RequestBody UserDetail userDetail){
        UserRest userRest = new UserRest();
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userDetail, userDto);

        UserDto createdUser = userService.createUser(userDto);
        BeanUtils.copyProperties(createdUser, userRest);

        return userRest;
    }

    @GetMapping(value = "/all")
    public List<UserEntity> getAll(){
        return userService.getAll();
    }
}
