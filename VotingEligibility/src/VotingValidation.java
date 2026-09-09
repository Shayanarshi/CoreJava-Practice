import java.util.Scanner;

public class VotingValidation  {
    public  void validateAge(int age) throws InvalidAgeException{
        if (age<18){
            throw  new InvalidAgeException(": Age must be 18 or above");
        }else {
            System.out.println("Eligible for vote");
        }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = sc.nextInt();
        VotingValidation obj = new VotingValidation();

        try{
            obj.validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException"+e.getMessage());
        }
        sc.close();
    }
    }
