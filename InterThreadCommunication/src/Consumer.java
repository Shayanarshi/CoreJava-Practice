public class Consumer extends  Thread{
    Buffer buffer;

    public Consumer(Buffer buffer){
        this.buffer = buffer;
    }
    @Override
    public void run() {
        for (int i = 1 ;i<=20;i++){
            buffer.consume();
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {}
        }
    }
}
