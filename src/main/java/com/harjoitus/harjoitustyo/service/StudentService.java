package com.harjoitus.harjoitustyo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harjoitus.harjoitustyo.data.ClassRoomCourse;
import com.harjoitus.harjoitustyo.data.Course;
import com.harjoitus.harjoitustyo.data.OnlineCourse;
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

    // Lisää opiskelijan
    public void addStudent(Student student) {
        students.add(student);
    }

    // Hakee opiskelijan tiedot
    public List<Student> getStudents() {
        return students;
    }

    //Lisää kurssin
    public void addCourse(Course course) {
        courses.add(course);
    }

    // Lisää online kurssin
    public void addOnlineCourse(OnlineCourse oCourse) {
        courses.add(oCourse);
    }

    //Lisää luokkakurssin
    public void addClassRoomCourse(ClassRoomCourse crCourse) {
        courses.add(crCourse);
    }

    //Hakee kurssit
    public List<Course> getCourses() {
        return courses;
    }

    //Lisää opiskelijan kurssille. Tämä työnalla
    public void studentToCourse() {
        
    }
}
