//create a class with the name "Counter"
//define a field count.
//define the methods increment(), decrement()
//and getCount().
//create atleast two objects, and invoke the methods.


package com.example;
 class  Counter{
     int count;

     void increment(){
         count++;
         System.out.println("The Value of Count after Increment: "+ count);
     }

     void decrement(){
         count--;
         System.out.println("The value of Count after Decrement: "+ count);
     }
     int getCount(){
         return count;
     }
 }


public class FindCount {
    public static void main(String[] args) {
       Counter c1= new Counter();
       Counter c2 = new Counter();

        c1.increment();
        c1.increment();
        c1.decrement();


        c2.increment();
        c2.decrement();
        System.out.println("final count of c1 is "+c1.getCount());
        System.out.println("Final count of c2 is  "+c2.getCount());
    }
}