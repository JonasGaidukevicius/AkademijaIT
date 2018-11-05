package lt.vtvpmc.ems.akademijait.rekursija;
// SITA REIKIA PABAIGTI!!!!!!
import java.io.*;
import java.util.Scanner;

public class ScannerFileReader_V2 {

    public static void main(String[] args) throws Exception{
        readFileOne();

    }

    public static void readFileOne()throws Exception{
        String separator = File.separator;
        String path = separator + "home" + separator + "jonas" + separator + "Desktop" + separator + "java_desktop.txt";
        File file = new File(path);
        Scanner reader = new Scanner(file);


        OutputStream os = null;
        try {

            os = new FileOutputStream(new File("java_is_desktop.txt"));
            while(reader.hasNext()){
                String line = reader.nextLine();
                System.out.println(line);
                System.out.println(line.getBytes());
                os.write(line.getBytes(), 1, line.length());
                os.write(Integer.parseInt("Tastes"));
                os.write(1);


            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
