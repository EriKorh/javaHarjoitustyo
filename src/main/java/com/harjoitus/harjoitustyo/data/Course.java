package com.harjoitus.harjoitustyo.data;

public class Course {
    private String courseName;
    private String teacher;
    private int credits;
    private long courseId;
    private static long idCounter = 0;

    public Course(String courseName, String teacher, int credits) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.credits = credits;
        this.courseId = idCounter++;
    }

    public Course() {
        this("","",0);
    }

    //public abstract String GetMoreInfo();

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public long getCourseId() {
        return this.courseId;
    }

    public String getTeacher() {
        return this.teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getCredits() {
        return this.credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
