import java.io.File;

public class ShowFile {
    public static void main(String[] args) {
        File file =  new File("data");
        String [] files = file.list();
        for (String alexa : files){
            System.out.println(alexa);
        }
    }
}
