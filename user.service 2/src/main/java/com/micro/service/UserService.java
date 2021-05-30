package com.micro.service;

import com.micro.VO.RestTemplate;
import com.micro.entity.User;

import com.micro.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserService userRepository;

    public User saveUser(User user) {

        return userRepository.saveUser(user);
    }

    public User findUserById(Long userId){
        return userRepository.findUserById(userId);
    }

    public RestTemplate getUserWithDepartment(Long userId) {
        RestTemplate restTemplate = new RestTemplate();
        User user  = userRepository.findUserById(userId);

    }
}

