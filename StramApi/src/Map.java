import java.util.Arrays;
import java.util.List;

public class Map {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 23, 7, 12, 6, 19);
        System.out.println(list);

        // map()
        list.stream()
                .map(i-> i*i)
                .forEach(i -> System.out.println(i));
    }
}