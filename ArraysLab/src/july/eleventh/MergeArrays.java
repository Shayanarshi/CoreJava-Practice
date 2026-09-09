package july.eleventh;

import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of First  array : ");
        int n = sc.nextInt();
        int [] arr1 =new int [n];
        System.out.println("Enter "+ n + " Elements:");
        for (int i= 0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        // second array
        System.out.println("Enter the Size of Second  array : ");
        int m = sc.nextInt();
        int [] arr2 =new int [m];
        System.out.println("Enter "+ m + " Elements:");
        for (int i= 0;i<m;i++){
            arr2[i] = sc.nextInt();
        }
         int [] merged = new int [n+m];
            for (int i= 0;i<n;i++){
            merged[i] = arr1[i];
        }
//            int k = 0;
        for (int i=0;i<m;i++){
            merged[n+i] = arr2[i];
        }
        System.out.println("Merged Array : ");
        for (int i= 0;i<n+m;i++){
            System.out.print(merged[i] + " ");
        }
    }
}
