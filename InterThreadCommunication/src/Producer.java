public class Producer extends Thread{
    Buffer buffer;

    public  Producer(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run(){
        for (int i =1 ; i<=20;i++){
            buffer.produce(i);
        }
    }
}
