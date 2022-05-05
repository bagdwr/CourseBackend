package com.example.CourseApp.controller;

import com.example.CourseApp.entity.Course;
import com.example.CourseApp.service.impls.CourseServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/course")
@RequiredArgsConstructor
public class CourseController {


    private final CourseServiceImpl courseGeneralService;

    @GetMapping("/")
    public List<Course> allCourses(){
        return courseGeneralService.getAll();
    }

    @GetMapping("/{id}")
    public Course getCourseById(
            @PathVariable Long id
    ){
        return courseGeneralService.getById(id);
    }


    @PostMapping("/")
    public void addCourse(
            @RequestBody Course course
    ){

        courseGeneralService.merge(course);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(
            @PathVariable Long id
    ){
        courseGeneralService.deleteById(id);
    }
}
