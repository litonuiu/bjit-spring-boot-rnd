package com.example.springbootrnd.service;

import com.example.springbootrnd.entity.User;
import com.example.springbootrnd.model.UserModel;

import java.util.List;

/**
 * Created by Md. Liton Miah
 * Created on April 04, 2023 at 3:56 PM
 */
public interface UserService {
    User saveUser(UserModel userModel);

    List<User> getAllUsers();
}
