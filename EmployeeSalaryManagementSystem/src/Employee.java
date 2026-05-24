public class Employee{

    private String empName;
    private double salary;
    private int experience;

    public void setEmpName(String empName){
        if(empName  != null && empName.trim().length()>0){
            this.empName = empName;
        }
    }
    public void setSalary(double salary){
        if(salary>=10000){
            this.salary=salary;
            System.out.println("Salary Updated:"+salary);
        }else{
            System.out.println("Invalid Salary. Must be >= 10000");
        }
    }

    public void setExperience(int experience){
        if(experience>=0){
            this.experience= experience;
            System.out.println("Experience Updated:"+experience);
        }else{
            System.out.println("Invalid Experience");
        }
    }

    public void displayEmployeeDetails(){
        System.out.println("Employee Details: ");
        System.out.println("Name: " +empName);
        System.out.println("Salary: "+ salary);
        System.out.println("Experience: "+ experience+" years");

    }


    public String getEmpName() {
        return empName;
    }

    public double getSalary() {
        return salary;
    }

    public int getExperience() {
        return experience;
    }
}


