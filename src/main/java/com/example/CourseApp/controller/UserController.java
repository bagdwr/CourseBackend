package com.example.CourseApp.controller;


import com.example.CourseApp.entity.Users;
import com.example.CourseApp.service.impls.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl usersGeneralService;

    @PostConstruct
    public void init() throws ParseException {
        Long id = 1L;

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Users user1 = new Users(id++,"Atymtay Bakbergen", "atymtaevbak@bk.ru",
                "123",simpleDateFormat.parse("2001-11-01"));
        Users user2 = new Users(id++,"Sakhtarov Daurbek", "sakhtarov@gmail.com",
                "123", simpleDateFormat.parse("2001-03-11"));
        Users user3 = new Users(id,"Azamat Umbetov", "umbetov@mail.ru",
                "123", simpleDateFormat.parse("2002-05-23"));
        usersGeneralService.save(user1);
        usersGeneralService.save(user2);
        usersGeneralService.save(user3);
    }


    @GetMapping("/allUsers")
    public List<Users> allUsers(){
        return usersGeneralService.getAll();
    }

    @GetMapping("/userById/{id}")
    public Users getUserById(
            @PathVariable Long id
    ){
        return usersGeneralService.getById(id);
    }

    @PostMapping(value = "/login")
    public Users login(
            @RequestParam("email") String email,
            @RequestParam("password") String password
    ) {
        Users user = usersGeneralService.getUserByEmail(email);
        if(user!=null && user.getPassword().equals(password)){
            return user;
        }

        return null;
    }

    @PostMapping("/register")
    public Boolean register(
            @RequestParam("fullname") String fullname,
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            @RequestParam("birthday") String birthday
    ) throws ParseException {
        Users user = usersGeneralService.getUserByEmail(email);

        if(user == null) {
            user = new Users();
            user.setFullName(fullname);
            user.setEmail(email);
            user.setPassword(password);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            user.setBirthday(simpleDateFormat.parse(birthday));

            usersGeneralService.save(user);

            return true;
        }

        return false;
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(
            @PathVariable Long id
    ){
        usersGeneralService.deleteById(id);
    }
}
