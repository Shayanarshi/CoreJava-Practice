import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        File file = new File("data");
       String[] files = file.list();
        for (String f : files){
            System.out.println(f);
        }
    }
}
