package level.advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>(Arrays.asList(80.0, 200.0, 600.0, 1200.0, 50.0, 900.0));
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)>500){
                double price = list.get(i);
                list.set(i,price*.9);
            }
        }
        System.out.println("Price  After 10% discount on items > 500:" +list);
        list.removeIf(alexa-> alexa<100);
        System.out.println("After removing items < 100:" +list);

    }
}
