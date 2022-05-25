package com.example.CourseApp.controller;


import com.example.CourseApp.entity.Users;
import com.example.CourseApp.service.impls.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl usersGeneralService;

    @GetMapping("/")
    public List<Users> allUsers(){
        return usersGeneralService.getAll();
    }

    @GetMapping("/{id}")
    public Users getUserById(
            @PathVariable Long id
    ){
        return usersGeneralService.getById(id);
    }

    @PostMapping(value = "/checkLoginAndPassword")
    public Users check(
            @RequestParam("email") String email,
            @RequestParam("password") String password
    ) {
        Users user = usersGeneralService.getUserByEmail(email);
        if(user!=null && user.getPassword().equals(password)){
            return user;
        }

        return null;
    }

    @PostMapping("/")
    public void addUser(
            @RequestBody Users user
    ){

        usersGeneralService.merge(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(
            @PathVariable Long id
    ){
        usersGeneralService.deleteById(id);
    }
}
