package lt.vtvpmc.ems.akademijait.jonas;

import java.io.File;
import java.io.IOException;

public class JavaExceptionChecked2 {
    public static void main(String[] args) {
        //Checked exceptions
        //Kaip 1, tik exception apdirbama ne metodo viduje, o ten, kur jis yra kvieciamas
        try{
            callFileException();
        } catch (IOException e){
            System.out.println(e);
        }





    }

    private static void callFileException() throws IOException{
        File file = new File("/homer/test.txt");

        file.createNewFile();


    }
}
