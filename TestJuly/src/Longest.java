import java.util.Arrays;
import java.util.Scanner;

public class Longest {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Input:");
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        Arrays.sort(arr);

        int start=arr[0],maxStart=arr[0];
        int count=1,max=1;

        for(int i=1;i<n;i++) {

            if(arr[i]==arr[i-1])
                continue;

            if(arr[i]==arr[i-1]+1)
                count++;
            else {
                if(count>max) {
                    max=count;
                    maxStart=start;
                }
                start=arr[i];
                count=1;
            }
        }

        if(count>max) {
            max=count;
            maxStart=start;
        }

        System.out.println("Longest Sequence:");

        for(int i=0;i<max;i++)
            System.out.print((maxStart+i)+" ");

        sc.close();
    }
}