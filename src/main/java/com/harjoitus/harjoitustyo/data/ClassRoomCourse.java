package com.harjoitus.harjoitustyo.data;

public class ClassRoomCourse extends Course {
    private String ZoomAddress;
    
    public ClassRoomCourse(String courseName, String teacher, int credits, String ZoomAddress) {
        super(courseName, teacher, credits);
        this.ZoomAddress = ZoomAddress;
    }

    public String GetMoreInfo() {
        return ZoomAddress;
    }

    public String getZoomAddress() {
        return this.ZoomAddress;
    }

    public void setZoomAddress(String ZoomAddress) {
        this.ZoomAddress = ZoomAddress;
    }
}

    
