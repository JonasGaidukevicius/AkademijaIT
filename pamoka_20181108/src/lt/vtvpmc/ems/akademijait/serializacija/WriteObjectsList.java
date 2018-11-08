package lt.vtvpmc.ems.akademijait.serializacija;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectsList {
    public static void main(String[] args) {

        Person[] people = {new Person(1, "Tomas TRibušauskas"), new Person(1, "Justina Balsė")};

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("people_kitas.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            //ObjectOutputStream moka paversti objektus į binarinį kodą.
            //O FileOutputStream moka binarinę informaciją binariniu būdu įrašyti į failą.

            objectOutputStream.writeInt(people.length);

            for (Person person: people) {
                objectOutputStream.writeObject(person);
            }


            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
