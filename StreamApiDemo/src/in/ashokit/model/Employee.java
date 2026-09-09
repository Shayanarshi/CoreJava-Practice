package in.ashokit.model;

public class Employee {
    private  int empno;
    private  String ename;
    private  double sal;
    private  String department;

  // constructor
    public Employee(int emono, String ename, double sal, String department) {
        this.empno = emono;
        this.ename = ename;
        this.sal = sal;
        this.department = department;
    }

    // getters and setter
    public int getEmpno() {
        return empno;
    }
    public void setEmpno(int empno) {
        this.empno = empno;
    }
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSal() {
        return sal;
    }
    public void setSal(double sal) {
        this.sal = sal;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emono=" + empno +
                ", ename='" + ename + '\'' +
                ", sal=" + sal +
                ", department='" + department + '\'' +
                '}';
    }
}