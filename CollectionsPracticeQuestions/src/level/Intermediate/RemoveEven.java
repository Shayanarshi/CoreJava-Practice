package level.Intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveEven {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list.removeIf(alexa-> alexa%2==0);
        System.out.println("After removing evens:" +list);
    }
}
