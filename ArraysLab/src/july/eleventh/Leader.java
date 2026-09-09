package july.eleventh;

import java.util.Scanner;

public class Leader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Leaders : ");
        for (int i = 0 ; i < n; i++) {
            boolean leader = true;
            for (int j = i+1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }
            if (leader){
                System.out.print(arr[i]+" ");
            }
        }
        sc.close();
    }

}
