package level.advanced;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class EmployeeSalary {
    public static void main(String[] args) {
        String [] names = {
                "Amy", "Ben", "Cara", "Dan", "Eva", "Finn"
        };
        int[] sal ={
                25000, 45000, 80000, 32000, 95000, 18000
        };

        List<String> lowSal = new ArrayList<>();
        List<String> midSal = new ArrayList<>();
        List<String> highSal = new ArrayList<>();

        for (int i = 0; i < names.length ; i++) {
            if (sal[i]<30000){
                lowSal.add(names[i]);
            } else if (sal[i]<=70000) {
                midSal.add(names[i]);

            }else {
                highSal.add(names[i]);
            }
        }
        System.out.println("Low  (< 30k):"+ lowSal);
        System.out.println("Mid (30k-70k):"+ midSal);
        System.out.println("High (> 70k):"+ highSal);


    }
}
