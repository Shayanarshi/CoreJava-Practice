package com.inheritance;
public class Alexa {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(1001 , "Shayan",125000,2);
        System.out.println("Details");
        System.out.println();
        System.out.println("Employee No:" + fullTimeEmployee.getEmpno());
        System.out.println("Ename:"+ fullTimeEmployee.getEname());
        System.out.println("Salary:" +fullTimeEmployee.calculateNetSalary());
        // 1 more statement

        System.out.println();


        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(1002,"Alexa",65,1500);
        System.out.println( "Employee No:" + partTimeEmployee.getEmpno());
        System.out.println( "Ename:" + partTimeEmployee.getEname());
        System.out.println( "Salary:" +partTimeEmployee.calculateNetAmount());
    }
}
