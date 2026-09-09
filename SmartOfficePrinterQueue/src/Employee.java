public class Employee extends  Thread{
    String employeeName;
    Printer printer;


    public Employee(String employeeName,Printer printer){
        this.printer = printer;
        this.employeeName = employeeName;
    }
    @Override
    public void run() {
            printer.printDocument(employeeName);

    }
}
