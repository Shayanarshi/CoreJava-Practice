public class Employee {
    private String employeeId;
    private String employeeName;
    private  double salary;




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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    // constructor

    public Employee(String employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }


    public void validateSalary() throws InvalidSalaryException{
            if (salary<15000) {
                throw new InvalidSalaryException("Salary Must be greater than 15000");
            }

                System.out.println("Employee Id : " + getEmployeeId());
                System.out.println("Employee Name : " + getEmployeeName());
                System.out.println("Salary : " + getSalary());
            }
}
