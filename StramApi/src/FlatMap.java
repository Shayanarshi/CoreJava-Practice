import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
//        List<List<Integer>>listOfLists = Arrays.asList(
//                Arrays.asList(1,2),
//                Arrays.asList(3,4,5),
//                Arrays.asList(6) );
//        List<Integer> allNumbers = listOfLists.stream()
//                .flatMap(c->c.stream())
//                .toList();
//        System.out.println(allNumbers);


//
//                // Practice
//        List<List<Integer>> lisOfList = Arrays.asList(
//                Arrays.asList(5,1,8),
//                Arrays.asList(6,2,9),
//                Arrays.asList(7,3,6)
//        );
//        List<Integer> allNumbers = lisOfList.stream()
//                .flatMap(c-> c.stream())
//                .toList();
//        System.out.println(allNumbers);



  //    just print the list content

        List<String> list = Arrays.asList("abc","cab","bca","cba");

//        list.forEach(s-> System.out.println(s));
//        shorter version
//        list.forEach(System.out::println);

//        list
//                .stream()
//                .map(str-> str.toUpperCase())
//                .forEach(System.out::println);

        // shortcut
        list
                .stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
