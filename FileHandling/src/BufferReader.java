import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;

public class BufferReader {
    public static void main(String[] args) {

        try(BufferedReader br =new BufferedReader(new FileReader("data/myfile.txt"))) {
            int k;
//            long x = System.currentTimeMillis();
            while((k= br.read()) != -1) {
                System.out.print((char) k);
            }
//            long y = System.currentTimeMillis();
//            System.out.println();
//            System.out.println((y - x) + "milliseconds");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
