public class Main {
    public static void main(String[] args) {

        VegOrder vegOrder = new VegOrder(101,"Rahul",2500,40);
        NonVegOrder nonVegOrder =  new NonVegOrder(102,"Priya",3500,50,200);

        System.out.println("-----Veg order-----");
        System.out.println();
        System.out.println(vegOrder);
        System.out.println(" Final Bill : " + vegOrder.calculateBill());
        System.out.println();
        System.out.println("-----Non-Veg order-----");
        System.out.println();
        System.out.println(nonVegOrder);
        System.out.println(" Final Bill : " + nonVegOrder.calculateBill());
        System.out.println();
    }

}
