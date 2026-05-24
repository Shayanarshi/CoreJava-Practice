//create a class Policy
//define the fields policyNo, basePremium, sumlnsured.
//define a method calculateFinalPremium() with the below
//conditions and return the result.
//        1. if sumlnsured > 5L then final premium is basePremium +
//        5% of sumlnsured
//2. if sumlnsured > 10L then final premium is basePremium+
//        10% of sumlnsured.
//        3. Otherwise, the final premium is basePremium only
//Define another method to display the policy details.
//create atleast two objects, and invoke the methods.

package com.example;
class Employee{
    int empno;
    String ename;
    double sal;

    Employee(int empno, String ename,double sal){
        this.empno=empno;
        this.ename= ename;
        this.sal= sal;
    }

    void displayEmployee(){
        System.out.println("Employee Number " + empno);
        System.out.println("Employee  Name "+ ename);
        System.out.println("Employee Salary " +sal);
    }
}
public class Main {
    public static void main(String[] args) {
        Employee e1= new Employee(101,"Shayan",60000);
        Employee e2= new Employee(102, "Alexa", 6000);
        e1.displayEmployee();
        e2.displayEmployee();
    }
}
