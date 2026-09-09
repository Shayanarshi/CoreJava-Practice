package level.Intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeTwoListsRemoveDifference {
    public static void main(String[] args) {
        List<Integer> listA = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        List<Integer> listB = new ArrayList<>(Arrays.asList(30, 40, 50, 60));
        listA.addAll(listB);
        System.out.println("Merged: "+listA);

        listA.removeAll(listB);
        System.out.println("A minus B:"+listA);
    }
}
