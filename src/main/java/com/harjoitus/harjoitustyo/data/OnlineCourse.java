package com.harjoitus.harjoitustyo.data;

public class OnlineCourse extends Course {
    private String zoomAddress;

    public OnlineCourse(String courseName, String teacher, int credits, String zoomAddress) {
        super(courseName, teacher, credits);
        this.zoomAddress = zoomAddress;
    }

    public String GetMoreInfo() {
        return zoomAddress;
    }

    public String getZoomAddress() {
        return this.zoomAddress;
    }

    public void setZoomAddress(String zoomAddress) {
        this.zoomAddress = zoomAddress;
    }

}
