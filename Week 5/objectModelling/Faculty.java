package com.bridgelabz.objectModelling;

class Faculty {
    String facultyName;

    Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    void getFacultyName() {
        System.out.println("Faculty Name: " + facultyName);
    }
}
