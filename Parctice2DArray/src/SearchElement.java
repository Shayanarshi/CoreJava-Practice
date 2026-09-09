import java.util.Scanner;

public class SearchElement {

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

        System.out.println("Enter element to search:");
        int element = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                if (matrix[i][j] == element) {

                    System.out.println("Element Found at Row = " + (i + 1)
                            + ", Column = " + (j + 1));

                    found = true;
                    break;
                }
            }

            if (found)
                break;
        }

        if (!found) {
            System.out.println("Element Not Found");
        }

        sc.close();
    }
}