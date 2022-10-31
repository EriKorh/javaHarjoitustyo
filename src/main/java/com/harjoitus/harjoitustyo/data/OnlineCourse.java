package com.harjoitus.harjoitustyo.data;

public class OnlineCourse extends Course {
    private String classroom;

    public OnlineCourse(String courseName, String teacher, int credits, String classroom) {
        super(courseName, teacher, credits);
        this.classroom = classroom;
    }

    public String GetMoreInfo() {
        return classroom;
    }

    public String getClassroom() {
        return this.classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

}
