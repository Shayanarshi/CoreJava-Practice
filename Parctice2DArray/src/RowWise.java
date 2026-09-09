import java.util.Scanner;

public class RowWise {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns:");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Row Sum
        for (int i = 0; i < rows; i++) {

            int sum = 0;

            for (int j = 0; j < columns; j++) {
                sum += matrix[i][j];
            }

            System.out.println("Row " + (i + 1) + " Sum = " + sum);
        }

        System.out.println();

        // Column Sum
        for (int j = 0; j < columns; j++) {

            int sum = 0;

            for (int i = 0; i < rows; i++) {
                sum += matrix[i][j];
            }

            System.out.println("Column " + (j + 1) + " Sum = " + sum);
        }

        sc.close();
    }
}