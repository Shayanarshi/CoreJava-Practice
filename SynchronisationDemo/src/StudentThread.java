public class StudentThread extends Thread{
    CourceService courceService;

    public  StudentThread (CourceService courceService){
        this.courceService = courceService;
    }
    @Override
    public  void run(){
        courceService.registerForCource();

    }
}
