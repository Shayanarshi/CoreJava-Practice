// This is a question from the lab practice Question , and There were some issue in the logic , so used this space for
// executing it ..
class Demo extends Thread {

    public void run() {
        System.out.print("Thread ");
    }

    public static void main(String[] args) throws  InterruptedException {
        Demo d = new Demo();
        d.start();

        Thread.sleep(3000);
        System.out.print("Main");
    }
}