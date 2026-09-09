import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("data/message.txt");
        int x ;
        while ((x = fileReader.read())!=-1){
            System.out.print((char) x);
        }
        fileReader.close();
    }
}
