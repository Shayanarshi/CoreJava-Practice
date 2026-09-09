import java.util.Scanner;

public class Alexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("S.NO  Vehicle Type  Charges per hour");
        System.out.println("1 → | Bike:         |₹20/hour ");
        System.out.println("2 → | Car:          |₹50/hour   ");
        System.out.println("3 → | Bus:          |₹100/hour   ");

           System.out.println("Enter the Number of Vehicles:");
           int n = sc.nextInt();
           double totalCollection = 0;
           int bikeCount = 0;
           int carCount = 0;
           int busCount = 0;

         for ( int i =1;i<=n;i++) {
             System.out.println("Vehicle number: " + i);
             System.out.println("Choose an option (1-3)");
             int type = sc.nextInt();

             System.out.println("Parking Hours:");
             int hours = sc.nextInt();

             System.out.println("Subscribed? 1 for yes and 0 for no");
             int subscription = sc.nextInt();

             double rate = 0;
             switch (type){
                 case 1:
                     rate =20;
                     bikeCount++;
                     break;
                 case 2:
                     rate =50;
                     carCount++;
                     break;
                 case 3:
                     rate =100;
                     busCount++;
                     break;
                 default:
                     System.out.println("Invalid Vehicle Type");
                     continue;
             }
                 double bill = rate * hours;
             if(hours>8){
                 double discount = bill*.1;
                 bill = bill-discount;
             }
             if(subscription == 1){
                  double subDidcount = bill*.05;
                  bill = bill- subDidcount;
             }
             totalCollection += bill;
             System.out.println("Vehicle "+ i+" collection  = " +bill);
         }
        System.out.println("Parking Collection Summary ");
        System.out.println("Bikes Parked : " + bikeCount);
        System.out.println("Cars Parked : " + carCount);
        System.out.println("Buses Parked : " + busCount);

        System.out.println("Total Revenue = ₹" + totalCollection);

        sc.close();
    }
}
