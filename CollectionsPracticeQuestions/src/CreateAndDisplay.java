import java.util.ArrayList;
import java.util.Scanner;

public class CreateAndDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter  5 Names : ");
        ArrayList<String> list = new ArrayList<>(5);

        for (int i = 0; i <5 ; i++) {
            list.add(sc.nextLine());
        }
        System.out.print(list);

    }
}
