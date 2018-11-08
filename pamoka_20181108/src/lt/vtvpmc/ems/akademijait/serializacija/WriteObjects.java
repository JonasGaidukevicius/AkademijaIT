package lt.vtvpmc.ems.akademijait.serializacija;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Tomas TRibušauskas");
        Person person2 = new Person(1, "Justina Balsė");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("people.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            //ObjectOutputStream moka paversti objektus į binarinį kodą.
            //O FileOutputStream moka binarinę informaciją binariniu būdu įrašyti į failą.
            objectOutputStream.writeObject(person1);
            objectOutputStream.writeObject(person2);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
