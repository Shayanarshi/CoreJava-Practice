import java.io.FileReader;

public class FileRead {
    public static void main(String[] args) {

        try(FileReader fr =new FileReader(  "data/myfile.txt")) {
            int k;
            long x = System.currentTimeMillis();
            while((k= fr.read()) != -1) {
                System.out.print((char) k);
            }
                long y = System.currentTimeMillis();
                System.out.println();
                System.out.println((y - x) + "milliseconds");
            }
        catch(Exception ex){
            ex.printStackTrace();
            }
    }
}
