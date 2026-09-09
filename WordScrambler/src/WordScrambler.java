import java.util.Random;

public class WordScrambler {

    public static String scramble(String word) {
        if (word.length() <= 3) {
            return word;
        }


        char[] letters = word.toCharArray();

        int last = word.length()-1;

        Random random = new Random();

        int pos1 = 1 + random.nextInt(last - 1);
        int pos2 = 1 + random.nextInt(last- 1);


        char temp = letters[pos1];
        letters[pos1] = letters[pos2];
        letters[pos2]= temp;

        return  new String(letters);
    }

    private static  String scrambleSentence (String sentence){
        String [] words = sentence.split(" ");
        


        for (int i = 0; i < words.length; i++) {
            words[i] = scramble(words[i]);
        }
        return String.join(" ",words);
    }

    public static void main(String[] args) {
        System.out.println(scramble("programming"));
        System.out.println(scramble("computer"));
        System.out.println(scramble("education"));
        System.out.println(scramble("cat"));
        System.out.println(scrambleSentence(" i don't give a damn for a man that can only spell  a word one way."));
    }
}