import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("C");

//        Iterator<String> itr = arrayList.iterator();
//        while(itr.hasNext()){
//            String str = itr.next();
//            System.out.println(str);
//            if(str.equals("C")){
//                arrayList.add("E");
//            }
//        }


        // fail-safe

        ConcurrentHashMap<String,String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("A","Apple");
        concurrentHashMap.put("B","Banana");
        concurrentHashMap.put("C","Cucumber");

        Set<Map.Entry<String,String>> entries = concurrentHashMap.entrySet();
        Iterator<Map.Entry<String,String>> itr = entries.iterator();
        while (itr.hasNext()){
            Map.Entry<String,String> entry = itr.next();
            System.out.println("Key: "+entry.getKey()+ ", value : "+entry.getValue());

            if (entry.getKey().equals("C"))
                concurrentHashMap.put("D","Dragon");
        }
    }
}
