public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setEmpid(101);
        employee1.setEname("John");
        employee1.setSal(5000);
        employee1.setDept("IT");
        
        Employee employee2 = new Employee();
        employee2.setEmpid(101);
        employee2.setEname("John");
        employee2.setSal(5000);
        employee2.setDept("IT");

        System.out.println(employee1.equals(employee2));
        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());

        String a = "Aa";
        String b = "BB";
        System.out.println();

    }
}
