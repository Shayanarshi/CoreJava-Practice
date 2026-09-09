class  MyThread extends Thread{
    @Override
    public void run(){

    }
}
public class ThreadNameDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        System.out.println("Default Name :"+t1.getName());
        System.out.println("Default Name :"+t2.getName());

        System.out.println();

        t1.setName("DownloadThread");
        t2.setName("UploadThread");

        System.out.println("Updated Name :"+t1.getName());
        System.out.println("Updated Name :"+t2.getName());

    }
}
