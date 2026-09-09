import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertLocateElements {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "D", "E"));
        list.add(2,"C");
        System.out.println("After insert: "+ list);
        System.out.println("indexOf D: "+list.indexOf("D"));
        System.out.println("lastIndexOf A: " + list.lastIndexOf("A"));

    }
}
