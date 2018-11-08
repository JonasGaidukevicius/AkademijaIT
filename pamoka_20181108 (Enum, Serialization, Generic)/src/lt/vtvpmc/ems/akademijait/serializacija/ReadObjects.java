package lt.vtvpmc.ems.akademijait.serializacija;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("people.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Person personOne = (Person) objectInputStream.readObject();
            Person personTwo = (Person) objectInputStream.readObject();

            System.out.println(personOne);
            System.out.println(personTwo);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }



    }
}
