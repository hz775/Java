package com.bridgelabz.inheritance;

class OnlineCourse extends Course {
    private String platform;
    private boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    public String getPlatform() {
        return platform;
    }

    public boolean isRecorded() {
        return isRecorded;
    }
}
