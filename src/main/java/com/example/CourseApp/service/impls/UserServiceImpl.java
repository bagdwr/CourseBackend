package com.example.CourseApp.service.impls;

import com.example.CourseApp.entity.Users;
import com.example.CourseApp.repository.UserRepository;
import com.example.CourseApp.service.GeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements GeneralService {


    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<Users> getAll() {
        return userRepository.findAll();
    }

    @Override
    public Users getById(Long id) {
        return userRepository.getById(id);
    }

    @Override
    public void save(Object object) {
        userRepository.save((Users) object);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    public Users getUserByEmail(String email) {
        return userRepository.findUsersByEmail(email);
    }
}
