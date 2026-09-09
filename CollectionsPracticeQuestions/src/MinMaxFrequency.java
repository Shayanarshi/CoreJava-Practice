import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMaxFrequency {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(Arrays.asList(3,7,3,1,9,3,5));
        System.out.println("Min : "+ Collections.min(list));
        System.out.println("Max : "+ Collections.max(list));
        System.out.println("Frequency of 3 : "  +Collections.frequency(list,3));



    }


}
