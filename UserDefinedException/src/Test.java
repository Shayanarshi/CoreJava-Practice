public class Test {
    public static void main(String[] args) {
        Account ac = new Account(3430509017L,7999);
        ac.deposit(1000);
        System.out.println("===============");
        ac.deposit(-1000);
        System.out.println("=================");
        ac.withdraw(1000);
        System.out.println("=================");
        ac.withdraw(10000);




    }
}
