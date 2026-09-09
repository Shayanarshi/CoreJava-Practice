import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseListWithoutBuiltIn {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        int start = 0;
        int end = list.size()-1;

        while (start<end){
            int temp = list.get(start);
            list.set(start,list.get(end));
            list.set(end,temp);
            start++;
            end--;
        }
        System.out.println("Reversed List: "+list);

    }
}
