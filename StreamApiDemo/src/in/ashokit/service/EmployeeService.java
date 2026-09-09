package in.ashokit.service;

import in.ashokit.model.Employee;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class EmployeeService {
    private  static List<Employee> getEmployees(){
        return Arrays.asList(
                new Employee(7516,"Shayan",70000,"Research"),
                new Employee(7167,"Alexa",6000,"IT"),
                new Employee(7285,"Rohit",5000,"IT"),
                new Employee(6528,"Allen",5246,"Research"),
                new Employee(7158,"John",2546,"HR"),
                new Employee(7025,"Alex",6824,"HR"),
                new Employee(6054,"Rohan",7536,"Research")

        );
    }
    // fetch employees of  the given department

    public  void fetchEmployeesByDepartment (String department ){
        List<Employee> list = EmployeeService.getEmployees();
        list
                .stream()
                .filter(e-> e.getDepartment().equalsIgnoreCase(department))
                .forEach(System.out::println);
    }


    public  void maxPaidEmployee(){
        List<Employee> list = getEmployees();


        Employee e = list

                // method 1
 //               .stream()
//              .sorted((e1,e2)->{
//                    if (e1.getSal()<e2.getSal()){
//                        return  1;
//                    } else if (e1.getSal() == e2.getSal()) {
//                        return  0;
//
//                    }else {
//                        return -1;
//                    }
//                });
/*
                // method 2
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSal).reversed())
                .findFirst()
                .get();
//                .toString();   // optional

        System.out.println(e.toString());
            */


        // more shorthand
                .stream()
                .max(Comparator.comparingDouble(Employee::getSal))
                .orElse(null);
                System.out.println(e);

    }



}
