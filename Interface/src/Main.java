import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What you want send ? 1.Email  2.SMS");
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("Enter Email");
                String email = sc.next();
                sc.nextLine();
                System.out.println("Enter text:");
                String text = sc.nextLine();
                NotificationSystem.sendNotification(new EmailNotification(),email,text);
                break;
            case 2:
                System.out.println("Enter mobile:");
                String mobile = sc.next();
                System.out.println("Enter text");
                String text2 = sc.nextLine();
                NotificationSystem.sendNotification(new SMSNotification(),mobile, text2);
                break;
            default:
                System.out.println("Wrong Choice");
                sc.close();

        }


    }
}
