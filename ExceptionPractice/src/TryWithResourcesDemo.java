import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResourcesDemo {
    public static void main(String[] args) {


        try(BufferedReader br = new BufferedReader(new FileReader("src/student.txt"))){
            System.out.println("File opened successfully");
            System.out.println("Reading....");

            String line;

            while ((line = br.readLine())!= null){
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("File not found ");
        }
    }
}
