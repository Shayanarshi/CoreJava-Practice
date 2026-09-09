import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateExtractSubCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        List<Integer> dup = new ArrayList<>();
        dup.addAll(list);
        List<Integer> SubCollection = dup.subList(1,4);

        System.out.println("Copied List:"+ dup);
        System.out.println("Extracted Sub-Collection (1 to 4):"+SubCollection);
    }
}
