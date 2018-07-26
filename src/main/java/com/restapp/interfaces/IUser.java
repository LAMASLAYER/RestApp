package com.restapp.interfaces;

import com.restapp.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUser extends JpaRepository<Users, Integer> {
}
