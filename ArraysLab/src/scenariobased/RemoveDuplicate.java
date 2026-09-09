package scenariobased;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an array : ");
        int n = sc.nextInt();
        int [] arr =new int [n];
        System.out.println("Enter "+ n + " Elements:");
        for (int i= 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Original Arrays : \n");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        // logic
          LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i=0;i<n;i++){
            set.add(arr[i]);
        }

        // printing

        System.out.print("\nArray after Removing Duplicate Element : \n");
        for (int num : set){
            System.out.print(num+ " ");
        }
        }

    }

