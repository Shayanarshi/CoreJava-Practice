import java.util.Scanner;

public class AscendingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        // array creation
        int[] arr = new int[size];
        System.out.println("Enter the Elements of an Array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Arrays Before Sorting :");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("\nArrays After Sorting :");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
