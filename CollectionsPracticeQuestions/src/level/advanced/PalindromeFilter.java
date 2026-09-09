package level.advanced;

import java.util.*;

public class PalindromeFilter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("level", "java", "racecar", "code", "madam", "noon", "data"));

        List<String> newList = new ArrayList<>();

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
           String word = (itr.next());
           String reverse = new StringBuilder(word).reverse().toString();

           if (word.equals(reverse)){
               newList.add(word);
           }
        }
        Collections.sort(newList);
        System.out.println("Palindromes: "+newList);

    }

}
