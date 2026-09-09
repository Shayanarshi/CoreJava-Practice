import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("data/message.txt");
        file.createNewFile();


        FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Welcome to Java File I/O\nLearning Streams");
            fileWriter.close();
        System.out.println();
        System.out.println("File Writing is Completed....✅");
    }
}
