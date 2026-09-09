public class NestedTryDemo {
    public static void main(String[] args) {
        try{
            try{
                int result = 5/0;
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Inner Exception : ");
                System.out.println(e.getMessage());
            }
            int [] arr=  new int [5];
            System.out.println(arr[5]);

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Outer Exception : ");
            System.out.println(ex.getMessage());
        }
        System.out.println("Program Completed");
    }
}
