import java.util.Scanner;

public class MirrorNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        int original = number;

        int reverse =0;

        while (number>0){
            int digit = number%10;
            reverse = reverse*10+digit;
            number =number/10;
        }

        System.out.println("Original" +original);
        System.out.println("Reversed "+ reverse);


        int temp1 = original;
        int temp2 = reverse;

        int count =0;
        while (temp1>0 && temp2>0){
            int digit1 = temp1 % 10;
            int digit2 = temp2 % 10;


            if (digit1 == digit2) {
                count++;
            }

            temp1 = temp1/10;
            temp2 = temp2/10;
        }
        System.out.println("Matching Position: "+count);
        sc.close();

    }
}
