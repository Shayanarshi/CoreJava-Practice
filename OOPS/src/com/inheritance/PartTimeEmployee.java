package com.inheritance;

public class PartTimeEmployee extends Employee {

    double hoursWorked;
    double pricePerHour;
    PartTimeEmployee(int empno,String ename, double hoursWorked, double pricePerHour){
        super(empno,ename);
        this.hoursWorked=hoursWorked;
        this.pricePerHour=pricePerHour;
    }
    public double calculateNetAmount(){
        return hoursWorked*pricePerHour;
    }
}
