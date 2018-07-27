package com.restapp.services;

import com.restapp.models.Users;
import com.restapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Users getUserById(Integer user_id) {
        return userRepository.getOne(user_id);
    }
    @Override
    public void saveUser(Users user) {
        userRepository.save(user);
    }
    @Override
    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }
}
