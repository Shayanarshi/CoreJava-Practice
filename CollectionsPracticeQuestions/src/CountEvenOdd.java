import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CountEvenOdd {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        int even=0;
        int odd = 0;
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)%2==0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("Even : "+ even);
        System.out.println("Odd :"+ odd);
    }
}
