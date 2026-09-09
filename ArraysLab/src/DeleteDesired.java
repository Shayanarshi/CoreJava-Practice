import java.util.Scanner;

public class DeleteDesired {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " +size+ " elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Original Arrays : \n");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nEnter the position to delete: ");
        int position = sc.nextInt();
        if(position<1 || position>size){
            System.out.println("Inavlid Position");
        }else {
            for (int i = position;i<size-1;i++){
                arr[i] = arr[i+1];
            }
            System.out.println("Array after del");
            for (int i =0; i<size-1;i++){
                System.out.println(arr[i]+ " ");
            }
        }
        sc.close();
    }
}
