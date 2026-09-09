import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Size of an Array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.println("Enter the Elements of an Array: ");

        for(int i=0; i<size;i++){
            arr[i] = sc.nextInt();
        }
        int peak = peakElement(size, arr);
        System.out.println("Peak element is: " + peak);
        sc.close();
    }
    private static int peakElement(int size, int arr[]) {
        int low = 1;
        int high = size-1;

        while (low<=high) {

            int mid=(low+high)/2;

            if (arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
                return arr[mid];
            }
            if (arr[mid-1]>arr[mid]) {
                high=mid-1;
            } else {
                low=mid+1;
            }
        }
        return -1;
     }
    }
