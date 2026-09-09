import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();

        String [] words = str.split(" ");
        String longest = "";

        for (int i =0; i<words.length;i++){
            if (words[i].length()>longest.length()){
                longest = words[i];
            }
        }
        System.out.println("Longest Word = "+longest);
        System.out.println("Length = "+longest.length());
    }
}
