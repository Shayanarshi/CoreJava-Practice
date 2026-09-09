package com.example;

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Employee [] arr = new Employee[5];
        arr[0]= new Employee(101,"Amar",35000,26,"Hyd");
        arr[1]= new Employee(102,"Shayan",43000,21,"Pune");
        arr[2]= new Employee(103,"Arshi",38000,24,"Bangalore");
        arr[3]= new Employee(104,"alexa",29000,22,"Hyd");
        arr[4]= new Employee(105,"Alexa",27000,17,"Pune");

//        System.out.println("Details are : ");
//
//        for (Employee   e: arr){
//            System.out.println(e);
//        }
//
//        System.out.println("-------------------------------------");

        // display employee details whose id is 103

//        for (Employee  e : arr){
//            if (e.id == 103){
//                System.out.println(e);
//            }
//        }

        // display employee details whose id is 102 and 104

//        for (Employee  e : arr){
//            if (e.id == 103 || e.id==104){
//                System.out.println(e);
//            }
//        }

        // display employeee belong to hyd

//        for (Employee  e : arr){
//            if (e.location.equalsIgnoreCase("Hyd")){
//                System.out.println(e);
//            }
//        }

          // pune count
//        int count =0;
//        for (Employee  e : arr){
//            if (e.location.equalsIgnoreCase("pune")){
//                count++;
//            }
//        }
//        System.out.println("Count  : " + count);

//        boolean found = false;
//        for (Employee  e : arr){
//            if (e.name.equalsIgnoreCase("Ashok")){
//                System.out.println("Details : "+e);
//                found = true;
//                break;
//            }
//        }
//        if (!found) {
//            System.out.println("Error : No such Employee Exist");
//        }

//        for (Employee  e : arr){
//            if (e.name.startsWith("A")){
//                System.out.println("Details : "+e);
//            }
//        }

//        for (Employee  e : arr){
//            if (e.name.charAt(0) =='A'){
//                System.out.println("Details : "+e);
//            }
//        }

  // between 25 and 27
        for (Employee  e : arr){
            if (e.age>25 && e.age<27){
                System.out.println("Details : "+e);
            }
        }


        System.out.println("___________-");

// not between 25 and 27
        for (Employee e : arr) {
            if (e.age < 25 || e.age > 27) {
                System.out.println("Details : " + e);
            }
        }




















    }
}
public class Employee  {
    int id ;
    String  name ;
    double salary;
    int age;
    String location;

    public Employee(int id, String name, double salary, int age, String location) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.location = location;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", location='" + location + '\''
                ;
    }
}