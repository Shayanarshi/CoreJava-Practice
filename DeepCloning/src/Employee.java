public class Employee implements Cloneable {
    private int empno;
    private String ename;

    private  Department department;  // employee has a department
    public  Employee(int empno,String ename){
        this.empno = empno;
        this.ename =ename;
    }

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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        Department clonedDept = department.clone();
        cloned.setDepartment(clonedDept);
        return  cloned;

    }

    public  void printEmployee(){
        System.out.println("empno: " + empno);
        System.out.println("ename: " + ename);
        System.out.println("deptno: " + department.getDeptno());
        System.out.println("dname: " + department.getDname());
    }
}
