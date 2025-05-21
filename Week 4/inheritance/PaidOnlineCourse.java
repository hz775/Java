package com.bridgelabz.inheritance;

class PaidOnlineCourse extends OnlineCourse {
    private int fee;
    private float discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, int fee, float discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public void displayDetails() {
        System.out.println("Course name: " + getCourseName());
        System.out.println("Duration: " + getDuration());
        System.out.println("Platform: " + getPlatform());
        System.out.println("Is recorded: " + isRecorded());
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount);
        System.out.println("Total fee: " + (fee - (fee * discount / 100)));
    }
}
