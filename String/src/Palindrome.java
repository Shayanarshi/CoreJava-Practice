import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        boolean flag = isPalindrome(str);
        if (flag ) {
            System.out.println("The string is a palindrome.");
        }
        else {
            System.out.println("The string is not a palindrome.");
        }
        sc.close();
    }
    private static boolean isPalindrome(String str){


        if(str == null || str.isBlank()){
            System.out.println("wrong Input");
            return false;
        }
        int n= str.length();
        str = str.toLowerCase();
        for(int i =0, j=n-1; i<j;i++,j--){
            if(str.charAt(i) !=str.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
