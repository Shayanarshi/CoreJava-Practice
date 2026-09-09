import java.util.ArrayList;
import java.util.List;

public class Buffer {
   private List<Integer> integerList;
   private int capacity;

   Buffer(){
      integerList =  new ArrayList<>();
      capacity  = 10;
   }
   public synchronized void produce(int i){
      if (integerList.size() == capacity){
         try {
            wait();
         } catch (InterruptedException ex) {
            System.out.println(ex);
         }
      }
      integerList.add(i);
      System.out.println("Element is produced : "+i);
      notify();
   }
   public synchronized   void consume(){
      if (integerList.size() == 0){
         try {
            wait();
         }
         catch (InterruptedException ex){
            System.out.println(ex);
         }
      }
      Integer i = integerList.removeLast();
      System.out.println("Element is consumed : "+ i);
      this.notify();
   }
}
