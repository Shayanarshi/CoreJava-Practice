class StringExtractor{
    public void extract(String  s){
        try {
            //extract substring
            String substring = s.substring(0, 10);
            //print in upper case
            System.out.println(substring.toUpperCase());
        }
        catch ( NullPointerException e){
            System.out.println("NullPointerException:becasue input is 'null' " );
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBoundsException: Because the string is invalid");
        }
        catch (Exception e ){
            System.out.println("Exception: please check the input");
        }
        finally {
            System.out.println("Finally");
        }
    }
    public void format(String s){
        System.out.println(s.concat(" world!"));
    }
}
public class Test {
    public static void main(String[] args) {
        StringExtractor s1 = new StringExtractor();
        s1.extract("Shayan");
        s1.format("hello");
    }
}
