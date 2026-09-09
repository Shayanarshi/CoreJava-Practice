public class PropagationDemo {
    public static void divide() throws ArithmeticException{
        int a = 10;
        int b =0;
        int c = a/b;
        System.out.println(c);

    }
    public static void main(String[] args) {
        try{
            divide();
        } catch (ArithmeticException e) {
            System.out.println("Exception Handled : "+e.getMessage());
        }
        System.out.println("Program Continues");
    }
}
