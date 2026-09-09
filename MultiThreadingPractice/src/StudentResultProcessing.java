class CalculateResults extends  Thread{
    @Override
    public  void  run(){
        System.out.println("Calculating Result.....");
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Results Generated Successfully.");
    }
}

public class StudentResultProcessing {
    public static void main(String[] args) throws InterruptedException {
        CalculateResults t1 = new CalculateResults();

        t1.start();
        t1.join();
        System.out.println("Printing Mark Sheet...");


    }
}
