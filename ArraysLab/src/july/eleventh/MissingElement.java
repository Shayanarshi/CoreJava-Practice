package july.eleventh;

import java.util.Scanner;

public class MissingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
            boolean avl = false;
            System.out.println("Missing Elemnts : ");

            for (int i = min + 1; i < max; i++) {
                boolean present = false;

                for (int j = 0; j < n; j++) {
                    if (arr[j] == i) {
                        present = true;
                        break;
                    }
                }
                 if (!present){
                     System.out.print(i+" ");
                     avl = true;
                 }
            }
            if (!avl){
                System.out.println("No Missing Elements Available");
            }
            sc.close();
    }
}

