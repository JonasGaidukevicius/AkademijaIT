package lt.vtvpmc.ems.akademijait.serializacija;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectsListPatobulintas {
    public static void main(String[] args) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("people_kitas_patobulintas.bin"))) {



            Person[] people = (Person[]) objectInputStream.readObject();

            System.out.println(people[0]);
            System.out.println(people[1]);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }



    }
}
