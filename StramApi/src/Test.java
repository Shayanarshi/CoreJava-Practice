/*
 filter even elements of this list,
 square them and then sort the results
 in descending order.
 */
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(32,47,56,12,79,50);

        list
                .stream()
                .filter(i-> i%2== 0)
                .map(i-> i*i)
                .sorted((i1,i2)-> Integer.compare(i2,i1))
                .forEach(i-> System.out.println(i));
    }
}
