import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TraverseElements {
    public static void main(String[] args) {

        List<String > list = new ArrayList<>(Arrays.asList
                ("Alice","Shayan","Alexa","Arshi","Clinton"));

        for (String alexa : list){
            System.out.println(alexa);
        }
        System.out.println("==================");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());

        }
    }
}
