class ThreadDownloadManager extends  Thread{
    @Override
    public  void run(){
        for (int i = 1; i <=5 ; i++) {
            System.out.println("Downloading...");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e ){
                System.out.println(e);
            }
        }
        System.out.println("Download Completed");
    }
}
public class DownloadManager {
    public static void main(String[] args) {
    ThreadDownloadManager t1 = new ThreadDownloadManager();
    t1.start();
    }
}
