package in.ashokit.main;

import in.ashokit.service.EmployeeService;

public class Main {
    public static void main(String[] args) {
        EmployeeService empService = new EmployeeService();
        empService.fetchEmployeesByDepartment("ResearCH");
        System.out.println("===============================");
        // fetch max paid employee
        empService.maxPaidEmployee();
    }
}
