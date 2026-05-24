import java.util.Scanner;

public class UniqueCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        char ch = findUniqueCharacter(str);
        if(ch==' '){
            System.out.println("This String doesn't have non repeating charater");
        }else{
            System.out.println("The first non repeating Character is: " +ch);
        }
        sc.close();
    }
    private static char findUniqueCharacter(String str){
        if(str == null || str.isBlank()){
            System.out.println("Invalid Input");
            return ' ';
        }
        // lowwrcase
        str = str.toLowerCase();
        for (int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(str.indexOf(ch) == str.lastIndexOf(ch))
                return ch;
        }
        return ' ';
    }
}
