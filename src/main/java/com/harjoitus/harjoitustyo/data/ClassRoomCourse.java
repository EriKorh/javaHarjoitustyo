package com.harjoitus.harjoitustyo.data;

public class ClassRoomCourse extends Course {
    private String classroom;
    
    public ClassRoomCourse(String courseName, String teacher, int credits, String classroom) {
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

    
