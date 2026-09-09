import java.util.Scanner;

public class Alexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Single Alphabet: ");

        char ch = sc.next().charAt(0);

        if(ch>='A' && ch<='Z'){
            ch = (char) (ch+32);
        } else if (ch>='a' && ch<='z') {
            ch = (char) (ch-32);
        }else {
            System.out.println("Not a Alphabet");
            return;
        }
        System.out.println("The value: ");
        for (int i=0;i<5;i++){
            System.out.println(ch+" ");
            ch++;
            if(ch> 'Z' && ch < 'a'){
                ch = 'A';
            }
            if (ch> 'z'){
                ch = 'a';
            }
        }

        sc.close();
    }
}











