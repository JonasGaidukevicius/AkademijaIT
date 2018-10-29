package lt.vtvpmc.ems.akademijait.rekursija;
// SITA REIKIA PABAIGTI!!!!!!
import java.io.*;
import java.util.Scanner;

public class ScannerFileReader {

    public static void main(String[] args) throws Exception{
        readFileOne();

    }

    public static void readFileOne()throws Exception{
        String separator = File.separator;
        String path = separator + "home" + separator + "jonas" + separator + "Desktop" + separator + "java_desktop.txt";
        File file = new File(path);
        Scanner reader = new Scanner(file);

        FileOutputStream fos = new FileOutputStream("java_is_desktop.txt");
        DataOutputStream outStream = new DataOutputStream(new BufferedOutputStream(fos));

        while(reader.hasNext()){
            //System.out.println(reader.nextLine());
            String line = reader.nextLine();
            String naujaEilute = "/n";
            System.out.println(line);
            //copiedFile.write(line);
            outStream.writeUTF(line);
            outStream.writeUTF(naujaEilute);
        }
        outStream.close();
    }
}
