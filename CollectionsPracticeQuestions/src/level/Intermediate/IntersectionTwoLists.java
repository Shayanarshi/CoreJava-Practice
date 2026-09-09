package level.Intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntersectionTwoLists {
    public static void main(String[] args) {
        List<Integer> listA = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> listB  = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));

        listA.retainAll(listB);
        System.out.println("Intersection: "+ listA);

    }
}
