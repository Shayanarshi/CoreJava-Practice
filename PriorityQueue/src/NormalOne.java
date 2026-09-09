import java.util.Iterator;
import java.util.PriorityQueue;

public class NormalOne {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3);
        pq.add(7);
        pq.add(4);
        pq.add(2);
        pq.add(6);


//   only for temproray storing , yet not processsed .
//        for( Integer temp : pq){
//            System.out.println(temp);
//        }


        Iterator<Integer> iterator = pq.iterator();
//      System.out.println("The Processsed Elements are :");
        while (iterator.hasNext()){
            System.out.println(pq.poll());
        }
    }
}
