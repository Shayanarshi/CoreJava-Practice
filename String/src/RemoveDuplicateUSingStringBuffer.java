import java.util.Scanner;

public class RemoveDuplicateUSingStringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        String str2 = removeDuplicate(str);
        System.out.println("The Given String is: "+str);
        System.out.println("The string After removing Duplicate Element is: "+ str2);
        sc.close();
    }

    private static String removeDuplicate(String str){
        if(str ==null || str.trim().isEmpty())
            throw new IllegalArgumentException("The argument is invalid");

        str = str.toLowerCase();
        char[] chars = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for( char ch: chars){
            if(sb.indexOf(String.valueOf(ch)) == -1)
                sb.append(ch);
        }
        return sb.toString();
    }
}
