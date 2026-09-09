import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string1: ");
        String str1 = scan.nextLine();
        System.out.println("Enter a string2: ");
        String str2 = scan.nextLine();
        boolean flag = isAnagrams(str1, str2);
        if(flag)
            System.out.println("Anagrams");
        else
            System.out.println(" Not anagrams");
        scan.close();
    }
    private static boolean isAnagrams(String str1, String str2) {
        str1 = str1.replace(" ", "").toLowerCase();
        str2 = str2.replace(" ", "").toLowerCase();

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        for(int i=0; i<ch1.length-1;i++) {
            for(int j=0;j<ch1.length-1-i;j++) {
                if(ch1[j]>ch1[j+1]) {
                    char temp =ch1[j];
                    ch1[j]= ch1[j+1];
                    ch1[j+1]=temp;
                }
            }
        }

        for(int i=0; i<ch2.length-1;i++) {
            for(int j=0;j<ch2.length-1-i;j++) {
                if(ch2[j]>ch2[j+1]) {
                    char temp =ch2[j];
                    ch2[j]= ch2[j+1];
                    ch2[j+1]=temp;
                }
            }
        }
        boolean flag = true;
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ch2[i]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}