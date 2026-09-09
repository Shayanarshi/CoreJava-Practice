import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        int lcm = 0;
        int max = (a > b) ? a : b;

        for (int i = max; i <= a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                lcm = i;
                break;
            }
        }
        System.out.println("LCM of " + a + " and " + b + " is " + lcm + ".");
        scanner.close();
    }
}