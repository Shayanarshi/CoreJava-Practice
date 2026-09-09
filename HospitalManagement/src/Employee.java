import java.util.Scanner;

public class Employee {
    private  String employeeId;
    private  String employeeName;
    private  String department;
    private  double basicSalary;

    Scanner sc = new Scanner(System.in);

    // getters and setters

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    //methods

    public  void  acceptEmployeeDetails(){
        // need to work on it
        System.out.print("Please Enter Employee Id: ");
        employeeId = sc.nextLine();

        System.out.print("Please Enter Employee Name: ");
        employeeName = sc.nextLine();

        System.out.print("Please Enter Department: ");
        department = sc.nextLine();

        System.out.print("Please Enter Basic Salary: ");
        basicSalary = sc.nextDouble();
        sc.nextLine();

    }
    public void displayEmployeeDetails(){

        System.out.println("----Employee Details-----");
        System.out.println("Employee Id    : " +  getEmployeeId());
        System.out.println("Employee Name  : " + getEmployeeName());
        System.out.println("Department     : " + getDepartment());
        System.out.println("Basic Salary   : " + getBasicSalary());
    }
}
