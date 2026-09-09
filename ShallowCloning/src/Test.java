public class Test {
    public static void main(String[] args) throws  CloneNotSupportedException{
        Employee original = new Employee(101,"John");
        Department department = new Department(10,"Research");
        original.setDepartment(department);

        Employee cloned = original.clone();
        cloned.setEmpno(102);
        cloned.setEname("Miller");

        original.getDepartment().setDname("IT");   //  just to check if shallow copy or not


        System.out.println("=========Original employee Data========");
        original.printEmployee();
        System.out.println("======= Cloned Employee Data=========== ");
        cloned.printEmployee();




    }
}
