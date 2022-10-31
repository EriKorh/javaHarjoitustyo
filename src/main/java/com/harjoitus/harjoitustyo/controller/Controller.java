package com.harjoitus.harjoitustyo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.harjoitus.harjoitustyo.data.Course;
import com.harjoitus.harjoitustyo.data.OnlineCourse;
import com.harjoitus.harjoitustyo.data.Student;
import com.harjoitus.harjoitustyo.service.StudentService;

@RestController
public class Controller {

    @Autowired
    StudentService myStudentService;

    // Hakee opiskelijat
    @GetMapping("students")
    public List<Student> getStudents() {
        return myStudentService.getStudents();
    }

    // Hakee kurssit
    @GetMapping("courses")
    public List<Course> getCourses() {
        return myStudentService.getCourses();
    }

    // Lisää uuden opiskelijan
    @PostMapping("addstudent")
    public Student addStudent(@RequestParam String firstname, String lastname, String classname) {
        Student s = new Student(firstname, lastname, classname);
        myStudentService.addStudent(s);
        return s;
    }

    // Lisää uuden online kurssin, jos kenttään on kirjoitettu zoom osoite. Jos ei, niin zoom osoite jää tyhjäksi. 
    // Tämän olisi voinut tehdä paremmin, jos olisi aloittanut aiemmin
    
    @PostMapping("addcourse")
    public Course addCourse(@RequestParam String coursename, String teacher, int credits, String zoomAddress, Boolean zoom) {
        if(zoomAddress != null) {
            OnlineCourse oc = new OnlineCourse(coursename, teacher, credits, zoomAddress);
            myStudentService.addOnlineCourse(oc);
            return oc;
        } else {
            Course c = new Course(coursename, teacher, credits) {
                public String GetMoreInfo() {
                    return "ei tiedossa";
                } 
            };

            myStudentService.addCourse(c);
            return c;
        }
    }
}
