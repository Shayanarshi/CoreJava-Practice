public class main {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        System.out.println("The no of objects for Counter class as of now:" + Counter.getCount());

        Counter c77 = new Counter();
        Counter c73 = new Counter();
        Counter c49 = new Counter();
        System.out.println("The no of objects for Counter class as of now:" + Counter.getCount());
    }
}
