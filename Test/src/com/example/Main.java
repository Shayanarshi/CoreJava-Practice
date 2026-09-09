package com.example;
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Student Id:" + s.personId);
        System.out.println("Student Name:" + s.personName);
        System.out.println("Course Name:" + s.courseName);
        System.out.println("City:"+ s.address.city);
        System.out.println("State:" + s.address.state);
        System.out.println("Pincode:" + s.address.pincode);
    }
}