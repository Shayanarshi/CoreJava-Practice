class  Upload extends  Thread{
    @Override
    public  void run(){
        for (int i = 1; i <=3 ; i++) {
            System.out.println("Uploading...");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class FileUploadMonitoring {

    public static void main(String[] args) throws InterruptedException {
        Upload t1 = new Upload();
        t1.start();
        t1.join();
        System.out.println("File Uploaded Successfully\n");
    }
}
