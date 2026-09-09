public class Main {
    public static void main(String[] args) {
        Cource cource = new Cource("Java",1);

        CourceService courceService = new CourceService(cource);


         StudentThread t1 = new StudentThread(courceService);
         StudentThread t2 = new StudentThread(courceService);

         t1.setName("student1");
         t2.setName("student2");


         t1.start();
         t2.start();


    }
}
