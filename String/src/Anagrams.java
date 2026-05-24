import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String1");
        String str1 = sc.nextLine();
        System.out.println("Enter a String2");
        String str2 = sc.nextLine();
        boolean flag = findAnagrams(str1,str2);
        if(flag){
            System.out.println("String is Anagram");
        }else {
            System.out.println("String is not a anagram");
        }
    }
    private static  boolean findAnagrams(String str1,String str2){
        if(str1== null || str2== null || str1.isBlank()|| str2.isBlank())
            return false;
        if(str1.length() != str2.length())
            return  false;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // string to character
        char [] array1 = str1.toCharArray();
        char [] array2 = str2.toCharArray();

        // sort
        Arrays.sort(array1);
        Arrays.sort(array2);

        for ( int i =0; i<array1.length;i++){
            if(array1[i] != array2[i])
                return false;
        }
        return true;

    }
}
