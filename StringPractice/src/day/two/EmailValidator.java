package day.two;

import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Email : ");
        String email = sc.nextLine();


        int at =-1;
        int count =0;
        boolean dot = false;
        String domain = "";

        for (int i=0;i<email.length();i++){
            if (email.charAt(i) == '@'){
                count++;
                at =i;
            }
        }
        if (count != 1 || at <= 0) {
            System.out.println("Invalid Email : " + email);
            return;
        }

        // Find dot after @ and create domain
        for (int i = at + 1; i < email.length(); i++) {

            if (email.charAt(i) == '.') {
                dot = true;
            }

            domain = domain + email.charAt(i);
        }

        // Final Validation
        if (dot &&
                email.charAt(0) != ' ' &&
                email.charAt(email.length() - 1) != ' ' &&
                email.charAt(at - 1) != '.' &&
                email.charAt(at - 1) != '-' &&
                (domain.equals("gmail.com") || domain.equals("outlook.com"))) {

            System.out.println("Valid Email : " + email);

        } else {

            System.out.println("Invalid Email : " + email);

        }
    }
}
