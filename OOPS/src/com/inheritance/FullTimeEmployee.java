package com.inheritance;

public class FullTimeEmployee extends Employee{
   private double monthlySalary;
    private double leavesTaken;
    FullTimeEmployee(int empno,String ename,double monthlySalary,double leavesTaken){
        super(empno,ename);
        this.monthlySalary = monthlySalary;
        this.leavesTaken=leavesTaken;
        }
        public double calculateNetSalary(){
         double daySalary = monthlySalary/30;
            if(leavesTaken<=2){
                return monthlySalary;
            }else{
                return monthlySalary-(leavesTaken-2)*daySalary;
            }
        }
    }
