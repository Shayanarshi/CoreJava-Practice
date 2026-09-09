import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.next();

        char first = num.charAt(0);
        char last = num.charAt(num.length() - 1);

        String middle = num.substring(1, num.length() - 1);

        System.out.println("Before Swapping:"+num);
        System.out.println("After Swapping :"+last + middle + first);

    }
}