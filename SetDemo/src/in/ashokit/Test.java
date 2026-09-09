package in.ashokit;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(new Employee(7101,"John",7000,"IT"));
        employeeSet.add(new Employee(7934,"Mark",8000,"Research"));
        employeeSet.add(new Employee(7498,"Turner",4000,"Accounting"));
        employeeSet.add(new Employee(7673,"Howell",5000,"Sales"));
        employeeSet.add(new Employee(7863,"Sophia",7000,"HR"));
        employeeSet.add(new Employee(7721,"Allen",9000,"IT"));
        employeeSet.add(new Employee(7387,"Mary",5000,"HR"));
        employeeSet.add(new Employee(7269,"Jockob",3000,"Research"));



        System.out.println("The Employees of the Set:");

        for(Employee employee : employeeSet){
            System.out.println(employee);
        }

    }

}
