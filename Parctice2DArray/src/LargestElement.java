import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number of row of Matrix A: ");
        int rows = sc.nextInt();
        System.out.println("Enter the Number of Columns of Matrix A : ");
        int columns = sc.nextInt();

        int [][] A = new int[ rows] [columns];

        System.out.println("Enter the Elements of an Matrix A: ");
        for (int i = 0 ; i<A.length;i++){
            for (int j = 0;j<A[0].length;j++){
                A[i][j] = sc.nextInt();
            }
        }
         int  largest = A[0][0];

        for (int i =0; i<rows; i++){
            for (int j = 0 ; j<columns;j++){
                if (A[i][j]>largest){
                    largest = A[i][j];
                }
            }
        }
        System.out.println("\nLargest  Element : "+largest);
        sc.close();
    }
}

