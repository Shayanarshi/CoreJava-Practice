package level.Intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListAndListToArray {
    public static void main(String[] args) {
        String[] arr = {"Java", "Python", "C++"};
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        list.add("kotlin");
        System.out.println("List : "+list);

        String [] newArr = list.toArray(new String[0]);
        System.out.print("Array: ");
        for(String alexa : newArr){
            System.out.print(alexa+ " ");
        }

    }

}
