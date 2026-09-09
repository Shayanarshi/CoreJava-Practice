import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Alexa2 {
    public static void main(String[] args) {
        List<List<String>> listOfListOfStrings = Arrays.asList(
                Arrays.asList("Alexaa","avc","Allen"),
                Arrays.asList("Shayan","adhf"," ritika"),
                Arrays.asList("Hell","asdf", "Rohit"),
                Arrays.asList("dipika","asdfg","Alex"),
                Arrays.asList("John","asdf"),
                Arrays.asList("Warner")
        );
//        System.out.println(listOfListOfStrings);
        listOfListOfStrings
                .stream()
                .flatMap(Collection::stream)
                .filter(str-> str.length()% 2 == 0)
                .map(String :: toUpperCase)
                .sorted((s1,s2)-> s2.compareTo(s1))
                .forEach(System.out::println);
    }
}
