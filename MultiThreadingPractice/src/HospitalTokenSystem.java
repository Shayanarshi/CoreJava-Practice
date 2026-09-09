class Token extends Thread{
    @Override
    public void run() {
        for (int i = 101; i <=110 ; i++) {
            System.out.println("Token : "+i);

            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class HospitalTokenSystem {
    public static void main(String[] args) {

        Token t1 = new Token();
        t1.start();
    }
}
