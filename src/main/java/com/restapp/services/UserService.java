package com.restapp.services;

import com.restapp.models.Users;

import java.util.List;

public interface UserService {
    Users getUserById(Integer user_id);
    void saveUser(Users userDto);
    List<Users> getAllUsers();
}
