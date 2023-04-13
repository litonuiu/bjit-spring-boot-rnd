package com.example.springbootrnd.controller;

import com.example.springbootrnd.entity.User;
import com.example.springbootrnd.model.UserModel;
import com.example.springbootrnd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Md. Liton Miah
 * Created on April 05, 2023 at 12:09 PM
 */

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping
    public ResponseEntity<Object> saveUser(@RequestBody UserModel userModel){
        try {
            User user = userService.saveUser(userModel);
            return ResponseEntity.ok(user);
        } catch (Exception ex){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        try {
            List<User> users = userService.getAllUsers();
            return ResponseEntity.ok(users);
        } catch (Exception ex){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }
}
