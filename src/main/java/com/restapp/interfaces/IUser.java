package com.restapp.interfaces;

import com.restapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUser extends JpaRepository<User, Integer> {
}
