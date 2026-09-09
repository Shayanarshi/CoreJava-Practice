public class ExceptionMethodsDemo {
    public static void main(String[] args) {
        try{
            int result = 10/0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Message : ");
            System.out.println(e.getMessage());

            System.out.println("toString(): ");
            System.out.println(e.toString());

            System.out.println("Stack Trace :");
            e.printStackTrace();
        }
    }
}
