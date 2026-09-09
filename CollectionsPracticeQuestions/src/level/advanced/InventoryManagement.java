package level.advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InventoryManagement {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(
                Arrays.asList(120, 30, 85, 15, 200, 45));

        List<Integer> lowStock = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)<50){
                lowStock.add(list.get(i));
            }
        }
        System.out.println("Low Stocks Detected : "+lowStock);

        for (int i = 0; i < list.size(); i++) {
            list.set(i,list.get(i)+100);
        }
        System.out.print("Final stock after adding 100 to all: ");
        System.out.print(list);
    }
}
