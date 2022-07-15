package com.itorizon.learnspringboot.courses.controller;

import com.itorizon.learnspringboot.courses.bean.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CoursesController {

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return Arrays.asList(new Course(1," Microservices","rahul"));
    }

}
