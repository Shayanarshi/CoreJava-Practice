import java.io.File;
import java.io.IOException;

public class CreateDemo {
    public static void main(String[] args) throws IOException {

        File file  = new File("data/employee.txt");

        boolean flag = file.createNewFile();
        if (flag){
            System.out.println("File Created✅");
        }else {
            System.out.println("File already Exist 😒");
        }

    }
}
