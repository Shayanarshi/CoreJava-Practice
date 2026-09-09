package scenariobased;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class CommonElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // INPUT OF FIRST ARRAY
        System.out.println("Enter the Size of First  array : ");
        int n1 = sc.nextInt();
        int [] arr =new int [n1];
        System.out.println("Enter "+ n1 + " Elements:");
        for (int i= 0;i<n1;i++){
            arr[i] = sc.nextInt();
        }
            // input od 2nd array
        System.out.println("Enter the Size of Second  array : ");
        int n2 = sc.nextInt();
        int [] arr2 =new int [n2];
        System.out.println("Enter "+ n2 + " Elements:");
        for (int j= 0;j<n2;j++){
            arr2[j] = sc.nextInt();
        }
        int [] result = findCommonElements(arr,arr2);

        // priting
        System.out.println("\nCommon Elements: ");
        System.out.print("{");
        for (int i =0 ; i<result.length;i++){
            System.out.print(result[i]);

            if (i < result.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("}");
        sc.close();
}
     private  static  int[] findCommonElements(int[] arr, int [] arr2){

        // logic

         LinkedHashSet<Integer> set = new LinkedHashSet<>();
         for (int i=0; i<arr.length;i++){
             for (int j = 0 ;j<arr2.length;j++){
                 if (arr[i] == arr2[j]){
                     set.add(arr[i]);
                     break;
                 }
             }
         }
        int[] result = new int [set.size()];
         int index = 0;
         for (int num : set){
             result[index] = num;
             index++;
         }

         return result;
     }
}
