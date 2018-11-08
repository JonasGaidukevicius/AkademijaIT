package lt.vtvpmc.ems.akademijait.serializacija;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectsListPatobulintas {
    public static void main(String[] args) {

        Person[] people = {new Person(1, "Tomas TRibušauskas"), new Person(1, "Justina Balsė")};
        // Į try skliaustus įdedu rašymo obejtus kuriamus
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("people_kitas_patobulintas.bin"))) {
                       ;
            //ObjectOutputStream moka paversti objektus į binarinį kodą.
            //O FileOutputStream moka binarinę informaciją binariniu būdu įrašyti į failą.

            //objectOutputStream.writeInt(people.length);

            objectOutputStream.writeObject(people); //įrašau visą masyvą iškarto

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
