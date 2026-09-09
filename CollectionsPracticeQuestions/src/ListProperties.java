import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListProperties {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Mango", "Apple", "Banana"));
        System.out.println("Size: "+ list.size());
        System.out.println("Empty: "+ list.isEmpty());
        System.out.println("Container Apple: " + list.contains("Apple"));
        list.clear();
        System.out.println("After Clear : " +list.isEmpty());
    }
}
