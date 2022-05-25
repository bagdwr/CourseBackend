package com.example.CourseApp.service.impls;

import com.example.CourseApp.entity.Course;
import com.example.CourseApp.repository.CourseRepository;
import com.example.CourseApp.service.GeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements GeneralService {

    private final CourseRepository courseRepository;

    @Autowired
    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> getAll() {
        return courseRepository.findAll();
    }

    @Override
    public Course getById(Long id) {
        return courseRepository.getById(id);
    }

    @Override
    public void save(Object object) {
        courseRepository.save((Course) object);
    }


    @Override
    public void deleteById(Long id) {
        courseRepository.deleteById(id);
    }
}
