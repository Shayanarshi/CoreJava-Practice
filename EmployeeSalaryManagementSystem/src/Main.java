import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setEmpName("Sita");
        System.out.println("Enter Name:" + employee.getEmpName());

        employee.setSalary(8000);
        System.out.println("Enter Salary:" + employee.getSalary());

        employee.setSalary(15000);
        System.out.println("Enter Salary:"+ employee.getSalary());


        employee.setExperience(-2);
        System.out.println("Enter Experience:" +employee.getExperience());

        employee.setExperience(3);
        System.out.println("Enter Experience:" +employee.getExperience());

        employee.displayEmployeeDetails();
    }


}