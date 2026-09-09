import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Alexa {

    public static void main(String[] args) {


        List<List<Integer>> lisOfLists = Arrays.asList(
                Arrays.asList(5,1,8),
                Arrays.asList(6,2,9),
                Arrays.asList(7,3,6)
        );
//        Stream<List<Integer>> stream1 = lisOfLists.stream();
//        Stream<Integer> stream2= stream1.flatMap(Collection:: stream);
//        List<Integer> list = stream2.toList();
//        list.forEach(System.out::println);

        lisOfLists
                .stream()
                .flatMap(Collection:: stream)
                .toList()
                .forEach(System.out::println);
    }
}
