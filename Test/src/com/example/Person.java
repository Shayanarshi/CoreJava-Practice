package com.example;
class Person {
    int personId = 101;
    String personName = "Ravi";
}
class Address {
    String city = "Hyderbad";
    String state = "Telengana";
    int pincode = 500001;
}
class Student extends Person {
    String courseName = "Java FullStack";
    Address address = new Address();
}