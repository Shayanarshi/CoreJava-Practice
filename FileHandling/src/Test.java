import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("data/myfile.txt");
        boolean flag = file.createNewFile();

        if (flag){
            System.out.println("File is Created");
        }
        else {
            System.out.println("File is already Exist");
        }
    }
}
