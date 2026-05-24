import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        countVowels(str);
        sc.close();
    }

    private static void countVowels(String str){

        if (str == null || str.isBlank()){
            System.out.println("Invalid String");
            return;
        }
        // conver to lower case
        str = str.toLowerCase();
        byte vowelCount =0, consonentCount =0;

        for(int i=0; i<str.length();i++){
            char c = str.charAt(i);

            if(c>= 'a' && c<='z'){
                if(c=='a' || c== 'e'|| c == 'i' || c== 'o' ||c=='u' ){
                    vowelCount++;
                }else{
                    consonentCount++;
                }
            }
        }

        System.out.println("Vowel count " + vowelCount);
        System.out.println("Consonent Count " + consonentCount);

    }
}
