import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Id : ");
        String employeeId = sc.nextLine();

        System.out.print("Enter Employee Name : ");
        String employeeName = sc.nextLine();
        System.out.print("Enter Salary : ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(employeeId, employeeName, salary);

        try {
            emp.validateSalary();
        }
        catch(InvalidSalaryException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Process Completed.");
        }

        sc.close();
    }
}