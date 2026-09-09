import java.util.Scanner;

public class InsertNewElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        // array creation
        int[] arr = new int[size+1];
        // insertion of the elements of an array
        System.out.println("Enter " +size+ " elements in ascending order: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // just to see the original array
        System.out.print("Original Arrays : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nEnter the number of elements You want to Insert:");
        int element = sc.nextInt();

        int i;
        for(i=size-1; i>=0 && arr[i]>element;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[i+1] = element;


        System.out.println("\nArrays After Adding :");
        for (int j=0;j<=size;j++) {
            System.out.print(arr[j]+ " ");
        }
    }
}
