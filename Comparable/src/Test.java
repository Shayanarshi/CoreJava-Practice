import java.util.ArrayList;
import java.util.List;

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
       employeeList.sort(null);
       for(Employee employee : employeeList){
           System.out.println(employee);
       }
















//        System.out.println("List of Employees");
//        Iterator<com.comparable.Employee> iterator = employeeList.iterator();
//        while(iterator.hasNext()){
//            com.comparable.Employee employee = iterator.next();
//            System.out.println(employee);
//        }
//        System.out.println("===============================================================");
//        System.out.println("List of Employees in Reverse Order");
//        ListIterator<com.comparable.Employee> listIterator = employeeList.listIterator(employeeList.size());
//        while (listIterator.hasPrevious()){
//            com.comparable.Employee employee = listIterator.previous();
//            System.out.println(employee);
//        }
//
//        System.out.println("==========================================================");
//
//        System.out.println("List of Employees With Salary>5000");
//        Iterator<com.comparable.Employee> itr = employeeList.iterator();
//        while (itr.hasNext()){
//            com.comparable.Employee employee = itr.next();
//            if(employee.getSalary()>5000){
//                System.out.println(employee);
//            }
//        }
    }
}
