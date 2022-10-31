package com.harjoitus.harjoitustyo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harjoitus.harjoitustyo.data.Course;
import com.harjoitus.harjoitustyo.data.Student;

@Service
public class StudentService {
    
    @Autowired
    StudentFileService myFileService;
    private List<Student> students = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();
    /* 
    public StudentService() {
        try {
            students = myFileService.readFromFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    } */


    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void studentToCourse() {
        
    }
}
