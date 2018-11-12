package lt.vtvpmc.ems.akademijait.jonas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class JavaExceptionChecked1 {
    public static void main(String[] args) {
        //Checked exceptions

        callFileException();



    }

    private static void callFileException() {
        File file = new File("/homer/test.txt");

        try{
            file.createNewFile();
        } catch (IOException e){
            System.out.println(e);
        }

    }
}
