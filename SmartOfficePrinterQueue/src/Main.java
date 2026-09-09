public class Main {
    public static void main(String[] args) {
        System.out.println("Printer is Ready ");
        String [] employeeNames ={
                "Rahul",
                "Amit",
                "Priya",
                "Sneha",
                "Kiran"
        };
        Printer printer = new Printer();
       Employee [] employees = new Employee[employeeNames.length];

        for (int i = 0; i < employeeNames.length ; i++) {
            employees[i] =  new Employee(employeeNames[i],printer);

        }
        for (int i = 0; i < employees.length; i++) {
            employees[i].start();
        }
        try {
            for (Employee employee : employees) {
                employee.join();
            }
        }
        catch (InterruptedException e) {
                e.printStackTrace();
            }

        System.out.println("All Documents Printed Successfully.");
        }
    }
