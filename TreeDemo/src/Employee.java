import java.util.Comparator;
import java.util.Objects;

public  class Employee {
    private int empid;
    private  String ename;
    private double sal;
    private String dept;

    public Employee(int empid, String ename, double sal, String dept) {
        this.empid = empid;
        this.ename = ename;
        this.sal = sal;
        this.dept = dept;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empid == employee.empid && Double.compare(sal, employee.sal) == 0 && Objects.equals(ename, employee.ename) && Objects.equals(dept, employee.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empid, ename, sal, dept);
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", ename='" + ename + '\'' +
                ", sal=" + sal +
                ", dept='" + dept + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Employee o) {
//        return this.getEmpid()-o.getEmpid();      logic for Comparable
//    }
}