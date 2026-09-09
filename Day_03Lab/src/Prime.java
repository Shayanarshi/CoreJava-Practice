import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int  num = sc.nextInt();

        for(int i = 2;i<=num/2;i++){
            int second = num-i;
//          System.out.println(second);
            boolean prime1 = true;
            boolean prime2 = true;
            for(int j=2;j<i;j++){
                if (i%j==0){
                    prime1 =false;
                    break;
                }
            }
            for(int j=2;j<second;j++){
                if (second % j==0){
                    prime2 =false;
                    break;
                }
            }
            if(prime1 && prime2){
                System.out.println(i +" + "+ second + " = " + num);
            }
        }
    }
}
