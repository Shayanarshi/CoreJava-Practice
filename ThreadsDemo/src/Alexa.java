class  MyThread1 extends Thread{
    @Override
    public void run(){
        for (int i=1;i<=10;i++){
            System.out.println("i = "+i);
            try {
                Thread.yield();
            }catch (Exception ex){
                System.out.println(ex);
            }
        }
    }
}
class MyThraed2 extends Thread{
    @Override
    public  void run(){

        for (int j=11;j<=20;j++){
            System.out.println("j = "+j);
            try {
                Thread.yield();;
            }
            catch (Exception ex ){
                System.out.println(ex);
            }
        }
    }
}
public class Alexa {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.run();
        MyThraed2 t2 = new MyThraed2();
        t2.run();
    }
}