package com.harjoitus.harjoitustyo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.harjoitus.harjoitustyo.data.Course;
import com.harjoitus.harjoitustyo.data.Student;
import com.harjoitus.harjoitustyo.service.StudentService;

@RestController
public class Controller {

    @Autowired
    StudentService myStudentService;

    @GetMapping("students")
    public List<Student> getStudents() {
        return myStudentService.getStudents();
    }

    @GetMapping("courses")
    public List<Course> getCourses() {
        return myStudentService.getCourses();
    }

    @PostMapping("addstudent")
    public Student addStudent(@RequestParam String firstname, String lastname, String classname) {
        Student s = new Student(firstname, lastname, classname);
        myStudentService.addStudent(s);
        return s;
    }

    @PostMapping("addcourse")
    public Course addCourse(@RequestParam String coursename, String teacher, int credits, boolean courseinfo) {
        Course c = new Course(coursename, teacher, credits);
        myStudentService.addCourse(c);
        return c;
    }
}
