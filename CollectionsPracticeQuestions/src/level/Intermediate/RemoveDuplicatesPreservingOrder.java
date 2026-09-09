package level.Intermediate;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesPreservingOrder {
    public static void main(String[] args) {

        Set<Integer>set=  new LinkedHashSet<>(Arrays.asList(4, 2, 7, 2, 4, 9, 7, 1));

        System.out.println("Unique (order preserved): "+set);

    }
}
