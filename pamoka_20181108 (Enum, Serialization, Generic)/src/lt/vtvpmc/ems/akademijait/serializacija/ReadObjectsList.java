package lt.vtvpmc.ems.akademijait.serializacija;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectsList {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("people_kitas.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            int personCount = objectInputStream.readInt();
            Person[] people = new Person[personCount];

            for(int i = 0; i < personCount; i++){
                people[i] = (Person) objectInputStream.readObject();
            }

            //Person personOne = (Person) objectInputStream.readObject();
            //Person personTwo = (Person) objectInputStream.readObject();

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
