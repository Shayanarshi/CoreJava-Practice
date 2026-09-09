package in.ashokit.main;

import in.ashokit.model.User;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeUser {
    public static void main(String[] args) throws Exception {
        User user = new User(101,"allen","allen@gmail.com");

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("D:/alexa.ser"));
        outputStream.writeObject(user);

        System.out.println("Serialization is done ");
    }
}
