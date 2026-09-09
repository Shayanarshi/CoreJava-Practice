package in.ashokit.main;

import in.ashokit.model.User;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class DeserializationUser {
    public static void main(String[] args) throws Exception {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("D:/alexa.ser"));
        User userObjFromFile = (User) inputStream.readObject();

        System.out.println("id: "+ userObjFromFile.getId());
        System.out.println("name: "+ userObjFromFile.getName());
        System.out.println("email: "+ userObjFromFile.getEmail());
    }
}
