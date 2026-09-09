//class  MyThread1 extends Thread{
//    @Override
//    public void run(){
//        for (int i=1;i<=10;i++){
//            System.out.println("i = "+i);
//            try {
//                Thread.yield();
//            }catch (Exception ex){
//                System.out.println(ex);
//            }
//        }
//    }
//}
//class MyThraed2 implements  Runnable{
//    @Override
//      public  void run(){
//
//        for (int j=11;j<=20;j++){
//            System.out.println("j = "+j);
//            try {
//                Thread.yield();;
//            }
//            catch (Exception ex ){
//                System.out.println(ex);
//            }
//        }
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//
//        MyThread1 t1 = new MyThread1();
//
//        System.out.println(t1.getId());
//        System.out.println(t1.getName());
//        System.out.println(t1.getPriority());
//        t1.start();
//
//
//        MyThraed2 t2 = new MyThraed2();
//
//        // we are wrapping a Runnable object into a Thread object
//        Thread thread2 = new Thread(t2);
//        System.out.println(thread2.getId());
//
//        System.out.println(thread2.getName());
//        System.out.println(thread2.getPriority());
//
//        thread2.start();
//    }
//}