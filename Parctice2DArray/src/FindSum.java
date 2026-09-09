import java.util.Arrays;
import java.util.Scanner;

public class FindSum {
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
        // second one
        System.out.println("Enter the  number of row of Matrix B: ");
        int rows2 = sc.nextInt();
        System.out.println("Enter the Number of Columns of Matrix B : ");
        int columns2 = sc.nextInt();

        int [][] B = new int[ rows2] [columns2];
        System.out.println("Enter the Elements of an Matrix B: ");
        for (int i = 0 ; i<B.length;i++){
            for (int j = 0;j<B[0].length;j++){
                B[i][j] = sc.nextInt();
            }
        }
        if (A.length == B.length && A[0].length== B[0].length){
            int [] [] C = findAddition(A,B);

            System.out.println("Elements of A     :  "+Arrays.deepToString(A));
            System.out.println("Elements of B     :  "+Arrays.deepToString(B));
            System.out.println("Sum of Both A & B :  "+ Arrays.deepToString(C));
        }else{
            System.out.println(" can't be added ");
        }
        sc.close();
    }

    private static int [] []  findAddition(int [][] A, int B [][]) {

        int [][] C = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                C[i][j] = A[i][j] + B[i][j];

            }
        }
            return  C;
    }
}

