package com.harjoitus.harjoitustyo.data;

public class Student {
    private String firstName;
    private String lastName;
    private String className;
    private long id;
    private static long idCounter = 0;

    public Student() {
        this("", "", "");
    }

    public Student(String firstName, String lastName, String className) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.className = className;
        this.id = idCounter++;
    }

    public String getClassName() {
        return this.className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getId() {
        return this.id;
    }
}
