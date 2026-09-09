import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
         String str = sc.nextLine();

         int upper =0;
         int lower = 0;
         int digit=0;
         int special =0;
         // logic

        for (int i =0; i<str.length();i++){
            char ch = str.charAt(i);

            if (ch>='A' && ch<='Z'){
                upper++;
            } else if (ch>='a' && ch<='z') {
                lower++;
            } else if (ch>='0' && ch<='9') {
                digit++;
            }else {
                special++;
            }
        }

        System.out.println("Uppercase Letters = "+ upper);
        System.out.println("Lowercase = " + lower);
        System.out.println("Digits = "+ digit);
        System.out.println("Special Character = "+special);
    }
}
