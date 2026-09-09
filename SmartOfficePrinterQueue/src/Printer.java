public class Printer {

    boolean available = true;
    synchronized  void printDocument(String employeeName)  {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            available = false;
            System.out.println("Printing "+ employeeName+"'s"+" Document...");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Completed.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        available= true;
            notify();

    }

}
