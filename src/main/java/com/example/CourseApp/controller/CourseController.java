package com.example.CourseApp.controller;

import com.example.CourseApp.entity.Course;
import com.example.CourseApp.service.impls.CourseServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/course")
@RequiredArgsConstructor
public class CourseController {


    private final CourseServiceImpl courseGeneralService;

    @PostConstruct
    public void init2(){
        Long id = 1L;

        List<Course> courses = new ArrayList<>();


        Course course1 = new Course(id++,"Spring", 50, 4.5, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Praesent suscipit risus a dolor ultrices, quis efficitur enim mattis. Sed turpis libero, aliquet ac aliquet a, efficitur non mi. " +
                "Etiam vel gravida tortor, ut placerat urna. " +
                "Donec eu tortor at dolor lacinia finibus. " +
                "Nam sem nisi, viverra non leo ut, mollis mattis odio." +
                " Etiam at faucibus arcu, a eleifend tortor. ",
                "Zaur Tregulov",
                "https://img-c.udemycdn.com/course/240x135/4345538_3668_2.jpg");

        courses.add(course1);

        Course course2 = new Course(id++,"React", 64, 4.8, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Praesent suscipit risus a dolor ultrices, quis efficitur enim mattis. Sed turpis libero, aliquet ac aliquet a, efficitur non mi. " +
                "Etiam vel gravida tortor, ut placerat urna. " +
                "Donec eu tortor at dolor lacinia finibus. " +
                "Nam sem nisi, viverra non leo ut, mollis mattis odio." +
                " Etiam at faucibus arcu, a eleifend tortor. ",
                "Ivan Petrychenko",
                "https://img-b.udemycdn.com/course/240x135/1901422_8f67_5.jpg");

        courses.add(course2);

        Course course3 = new Course(id++,"Android from scratch", 69, 4.6, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Praesent suscipit risus a dolor ultrices, quis efficitur enim mattis. Sed turpis libero, aliquet ac aliquet a, efficitur non mi. " +
                "Etiam vel gravida tortor, ut placerat urna. " +
                "Donec eu tortor at dolor lacinia finibus. " +
                "Nam sem nisi, viverra non leo ut, mollis mattis odio." +
                " Etiam at faucibus arcu, a eleifend tortor. ",
                "Sergey Sumin",
                "https://img-c.udemycdn.com/course/240x135/1880266_7432_2.jpg");

        courses.add(course3);

        Course course4 = new Course(id++,"Flutter & Dart - The Complete Guide", 69, 4.3, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Praesent suscipit risus a dolor ultrices, quis efficitur enim mattis. Sed turpis libero, aliquet ac aliquet a, efficitur non mi. " +
                "Etiam vel gravida tortor, ut placerat urna. " +
                "Donec eu tortor at dolor lacinia finibus. " +
                "Nam sem nisi, viverra non leo ut, mollis mattis odio." +
                " Etiam at faucibus arcu, a eleifend tortor. ",
                "Dr.Angela Yu",
                "https://img-c.udemycdn.com/course/240x135/2259120_305f_6.jpg");

        courses.add(course4);

        Course course5 = new Course(id++,"Angular 9", 58, 4.5, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Praesent suscipit risus a dolor ultrices, quis efficitur enim mattis. Sed turpis libero, aliquet ac aliquet a, efficitur non mi. " +
                "Etiam vel gravida tortor, ut placerat urna. " +
                "Donec eu tortor at dolor lacinia finibus. " +
                "Nam sem nisi, viverra non leo ut, mollis mattis odio." +
                " Etiam at faucibus arcu, a eleifend tortor. ",
                "Vladilen Minin",
                "https://img-c.udemycdn.com/course/240x135/2486704_64d0.jpg");

        courses.add(course5);

        Course course6 = new Course(id++,"Java", 73, 4.8, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Praesent suscipit risus a dolor ultrices, quis efficitur enim mattis. Sed turpis libero, aliquet ac aliquet a, efficitur non mi. " +
                "Etiam vel gravida tortor, ut placerat urna. " +
                "Donec eu tortor at dolor lacinia finibus. " +
                "Nam sem nisi, viverra non leo ut, mollis mattis odio." +
                " Etiam at faucibus arcu, a eleifend tortor. ",
                "Nail Alishev",
                "https://img-c.udemycdn.com/course/240x135/1286174_1efc_9.jpg");

        courses.add(course6);

        Course course7 = new Course(id++,"Django", 75, 4.6, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Praesent suscipit risus a dolor ultrices, quis efficitur enim mattis. Sed turpis libero, aliquet ac aliquet a, efficitur non mi. " +
                "Etiam vel gravida tortor, ut placerat urna. " +
                "Donec eu tortor at dolor lacinia finibus. " +
                "Nam sem nisi, viverra non leo ut, mollis mattis odio." +
                " Etiam at faucibus arcu, a eleifend tortor. ",
                "Rustam Kamalov",
                "https://img-c.udemycdn.com/course/240x135/3686578_4303.jpg");

        courses.add(course7);

        Course course8 = new Course(id++,"Vue js", 48, 4.7, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Praesent suscipit risus a dolor ultrices, quis efficitur enim mattis. Sed turpis libero, aliquet ac aliquet a, efficitur non mi. " +
                "Etiam vel gravida tortor, ut placerat urna. " +
                "Donec eu tortor at dolor lacinia finibus. " +
                "Nam sem nisi, viverra non leo ut, mollis mattis odio." +
                " Etiam at faucibus arcu, a eleifend tortor. ",
                "Oleksandr Kokorin",
                "https://img-c.udemycdn.com/course/480x270/3615038_3827.jpg");

        courses.add(course8);

        Course course9 = new Course(id++,"SQL", 65, 4.8, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Praesent suscipit risus a dolor ultrices, quis efficitur enim mattis. Sed turpis libero, aliquet ac aliquet a, efficitur non mi. " +
                "Etiam vel gravida tortor, ut placerat urna. " +
                "Donec eu tortor at dolor lacinia finibus. " +
                "Nam sem nisi, viverra non leo ut, mollis mattis odio." +
                " Etiam at faucibus arcu, a eleifend tortor",
                "Zaur Dzyba",
                "https://img-c.udemycdn.com/course/240x135/3614940_d75d.jpg");


        Course course10 = new Course(id,"C#", 62, 4.2, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Praesent suscipit risus a dolor ultrices, quis efficitur enim mattis. Sed turpis libero, aliquet ac aliquet a, efficitur non mi. " +
                "Etiam vel gravida tortor, ut placerat urna. " +
                "Donec eu tortor at dolor lacinia finibus. " +
                "Nam sem nisi, viverra non leo ut, mollis mattis odio." +
                " Etiam at faucibus arcu, a eleifend tortor. ",
                "China Jeki Chan",
                "https://img-b.udemycdn.com/course/240x135/1318782_055b.jpg");

        courses.add(course10);

        for (Course c:
             courses) {
            courseGeneralService.save(c);
        }
    }

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
