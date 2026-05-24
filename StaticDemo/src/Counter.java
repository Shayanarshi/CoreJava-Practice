public class Counter {
    private static int count;
    static {
        count =0;
    }
    public Counter(){
        count++;
    }
    public static int getCount(){
        return count;
    }
}

