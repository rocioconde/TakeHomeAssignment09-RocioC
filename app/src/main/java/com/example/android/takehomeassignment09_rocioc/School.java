package com.example.android.takehomeassignment09_rocioc;

/**
 * Created by ccteuser on 4/3/17.
 */

public class School {


    private String name;
    private int numberOfStudents;
    private boolean programmingCourse;


    public School(String name, int numberOfStudents, boolean programmingCourse) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.programmingCourse = programmingCourse;
    }

    public School() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public boolean hasProgrammingCourse() {
        return programmingCourse;
    }

    public void setProgrammingCourse(boolean programmingCourse) {
        this.programmingCourse = programmingCourse;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nNumber of Students: " + numberOfStudents +
                "\nDoes it have a programming course? " + programmingCourse + "\n";
    }
}
