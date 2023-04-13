package com.example.springbootrnd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Liton Miah
 * Created on April 04, 2023 at 3:46 PM
 */
@RestController
public class HomeController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello All!, This is my first demo application!!";
    }
}
