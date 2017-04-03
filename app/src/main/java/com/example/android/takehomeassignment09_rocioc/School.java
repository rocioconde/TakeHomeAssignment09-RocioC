package com.example.android.takehomeassignment09_rocioc;

/**
 * Created by ccteuser on 4/3/17.
 */

public class School {


    private String name;
    private int numberOfStudents;
    private boolean hasProgrammingCourse;


    public School(String name, boolean hasProgrammingCourse, int numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.hasProgrammingCourse = hasProgrammingCourse;
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

    public boolean isHasProgrammingCourse() {
        return hasProgrammingCourse;
    }

    public void setHasProgrammingCourse(boolean hasProgrammingCourse) {
        this.hasProgrammingCourse = hasProgrammingCourse;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nNumber of Students: " + numberOfStudents +
                "\nDoes it have a programming course? " + hasProgrammingCourse + "\n";
    }
}
