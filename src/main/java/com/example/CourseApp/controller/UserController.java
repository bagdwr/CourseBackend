package com.example.CourseApp.controller;

import com.example.CourseApp.service.impls.CourseServiceImpl;
import com.example.CourseApp.service.impls.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl userService;
    

}
