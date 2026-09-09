package scenariobased;

import java.util.Scanner;

public class FindMaxMin {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        // Reading
        System.out.println("Enter the Size of an array : ");
        int n = sc.nextInt();
        int [] arr =new int [n];
        System.out.println("Enter "+ n + " Elements:");
        for (int i= 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int [] result = returnMaximumAndMinimum(arr);
        System.out.println("Maximum  and Minimum Elements: ");
        System.out.print("{");
        for (int i=0;i<result.length;i++){
            System.out.print(result[i]);
            if (i<result.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("}");
        sc.close();
    }
    private static  int [] returnMaximumAndMinimum( int[]arr){
        int max  = arr[0];
        int min  = arr[0];


        for (int i =1;i<arr.length;i++){
            if (arr[i]> max){
                max = arr[i];
            }
            if (arr[i]<min){
                min = arr[i];
            }
        }
        int [] result = new  int[2];
        result[0] = max;
        result[1] = min;

        return result;
    }
}
