import java.util.Scanner;

public class CopyArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        int [] copy = new int[size];
        System.out.println("Enter " +size +" Elements: ");

        for (int i =0 ; i<size;i++){
            System.out.print("Element["+i+"] : ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0;i<size;i++){
            copy[i] = arr[i];
        }
        System.out.println("Original Array : ");
        for (int i= 0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nCopied Array : ");
        for (int i=0;i<size;i++) {
            System.out.print(copy[i] + " ");
        }
    }
}
