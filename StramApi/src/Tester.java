import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Tester {
    public static void main(String[] args) {

      /*   creating a list
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
         */

  //      ShortCut to do the Same


        List<Integer> list= Arrays.asList(4,23,7,12,6,19);
        System.out.println(list);
//         or
//         List<Integer> list2 = List.of(1,2,3,4,5);
//        System.out.println(list2);

        /*
        Stream<Integer> stream = list.stream();
        Stream<Integer> stream2= stream.filter(i-> i %2 ==0);
        stream2.forEach(i-> System.out.println(i));
        */

        // Other Way to write


    list.stream()
            .filter(i-> i%2 != 0)
            .forEach(i-> System.out.println(i));

    }

}
