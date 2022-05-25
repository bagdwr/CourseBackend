package com.example.CourseApp.controller;

import com.example.CourseApp.entity.Course;
import com.example.CourseApp.service.impls.CourseServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
@RequiredArgsConstructor
public class CourseController {


    private final CourseServiceImpl courseGeneralService;

    @GetMapping("/allCourses")
    public List<Course> allCourses(){
        return courseGeneralService.getAll();
    }

    @GetMapping("/courseById{id}")
    public Course getCourseById(
            @PathVariable Long id
    ){
        return courseGeneralService.getById(id);
    }


    @PostMapping("/addCourse")
    public void addCourse(
            @RequestBody Course course
    ){

        courseGeneralService.save(course);
    }

    @DeleteMapping("/deleteCourse{id}")
    public void deleteCourse(
            @PathVariable Long id
    ){
        courseGeneralService.deleteById(id);
    }
}
