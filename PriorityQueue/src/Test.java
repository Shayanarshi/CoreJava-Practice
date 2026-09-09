import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {
        PriorityQueue<Employee> pq = new PriorityQueue<>(new IdComparator());
        pq.add(new Employee(7101,"John",7000,"IT"));
        pq.add(new Employee(7934,"Mark",8000,"Research"));
        pq.add(new Employee(7498,"Turner",4000,"Accounting"));
        pq.add(new Employee(7673,"Howell",5000,"Sales"));
        pq.add(new Employee(7863,"Sophia",7000,"HR"));

//        for(Employee e : pq){
//            System.out.println(e);
//        }


        Iterator<Employee> iterator = pq.iterator();
        while(iterator.hasNext()){
            System.out.println(pq.poll());
        }
        System.out.println("Size : "+pq.size());

    }
}
