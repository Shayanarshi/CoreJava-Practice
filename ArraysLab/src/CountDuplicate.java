 import java.util.Scanner;
public class CountDuplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        // loop to insert the elements from the user
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < size; i++) {
            boolean exist = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    exist = true;
                    break;
                }
            }
            if (exist) {
                continue;
            }
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println("Total Duplicate Elements : " + count);
        sc.close();
    }
}


