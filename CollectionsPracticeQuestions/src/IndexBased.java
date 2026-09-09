import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IndexBased {
    public static void main(String[] args) throws InterruptedException {

        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
//        System.out.println(list);
        System.out.println("Element :  "+list.get(2));
        Thread.sleep(3000);
        list.set(1,99);
        System.out.println("Updated : " + list);
        Thread.sleep(3000);
        list.remove(3);
        System.out.println("Final : " + list);

    }
}
