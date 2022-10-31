package com.harjoitus.harjoitustyo.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.harjoitus.harjoitustyo.data.Student;

@Service

// Tiedostonhallintaa en saanut millään toimimaan githubista löytyvän esimerkin avulla enkä netistä löytyvän tiedon avulla

public class StudentFileService {

    public void writeToFile(List<Student> students) throws IOException {
        FileWriter myWriter = new FileWriter("students.txt");
        for (Student student : students) {
            myWriter.write(student.getFirstName() + System.lineSeparator());
            myWriter.write(student.getLastName() + System.lineSeparator());
            myWriter.write(student.getClassName() + System.lineSeparator());
        }
        myWriter.close();
    }

    public List<Student> readFromFile() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("students.txt"));
        List<Student> students = new ArrayList<>();
        while(sc.hasNextLine()) {
            String[] studentInfo = sc.nextLine().split(" ");
            Student s = new Student(studentInfo[0],studentInfo[1], studentInfo[2]);
            students.add(s);
        }
        sc.close();
        return students;
    }
}
