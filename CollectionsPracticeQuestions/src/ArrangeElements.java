import java.util.*;

public class ArrangeElements {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5,2,8,1,9,3));
        Collections.sort(list);
        System.out.println("Sorted : " +list);
        Collections.reverse(list);
        System.out.println("Reverse : "+ list);
    }
}
