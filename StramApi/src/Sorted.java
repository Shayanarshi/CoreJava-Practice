import java.util.Arrays;
import java.util.List;

public class Sorted {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 23, 7, 12, 6, 19);
        System.out.println(list);

        // sort teh numbers
        list.stream()
                .sorted((i1,i2) -> Integer.compare(i1,i2))
                .forEach(i-> System.out.println(i));

    }
}