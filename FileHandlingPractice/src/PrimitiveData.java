import java.io.*;

public class PrimitiveData {
    public static void main(String[] args) throws IOException {
        File file =  new File("data/alexaa.txt");
        file.createNewFile();

        DataOutputStream dos = new DataOutputStream
                (new FileOutputStream(file));

        int id = 101;
        double salary = 45000.50;
        boolean active = true;

        dos.writeInt(id);
        dos.writeDouble(salary);
        dos.writeBoolean(active);

        dos.close();


        DataInputStream dis = new DataInputStream(new FileInputStream(file));

        int readId = dis.readInt();
        double readSalary = dis.readDouble();
        boolean readActive = dis.readBoolean();
        dis.close();

        System.out.println("ID      : " + readId);
        System.out.println("Salary  : " + readSalary);
        System.out.println("Active  : " + readActive);



    }
}
