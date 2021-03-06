package com.example.CourseApp.service;

import java.util.List;

public interface GeneralService<T> {

    List<T> getAll();

    T getById(Long id);

    void save(T object);

    void deleteById(Long id);
}
