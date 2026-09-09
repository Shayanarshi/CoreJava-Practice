import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test {
    public  static  List<Employee> getEmployeesList(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(7101,"John",7000,"IT"));
        employeeList.add(new Employee(7934,"Mark",8000,"Research"));
        employeeList.add(new Employee(7498,"Turner",4000,"Accounting"));
        employeeList.add(new Employee(7673,"Howell",5000,"Sales"));
        employeeList.add(new Employee(7863,"Sophia",7000,"HR"));
        employeeList.add(new Employee(7721,"Allen",9000,"IT"));
        employeeList.add(new Employee(7387,"Mary",5000,"HR"));
        employeeList.add(new Employee(7269,"Jockob",3000,"Research"));
        return  employeeList;
    }
    public static void main(String[] args) {
        List<Employee> employeeList = getEmployeesList();

        // sort the employees in ascending order of id's

        System.out.println("The list of Employees in ascending order of their id's: ");
        employeeList.sort(new IdComparator());
        for(Employee employee : employeeList){
            System.out.println(employee);
        }
        System.out.println("=========================================");

        // sort the employees in ascending order of their names

        System.out.println("The list of Employees in ascending order of their Names: ");
        employeeList.sort(new NameComparator());
        for (Employee employee: employeeList){
            System.out.println(employee);
        }
    }
}

