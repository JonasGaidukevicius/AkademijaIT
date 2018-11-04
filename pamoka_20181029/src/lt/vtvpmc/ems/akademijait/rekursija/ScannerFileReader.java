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
        String path = separator + "home" + separator + "jonasnamai" + separator + "Desktop" + separator + "java_desktop.txt";
        File file = new File(path);
        Scanner reader = new Scanner(file);

        BufferedWriter out = new BufferedWriter(new FileWriter("java_is_desktop.txt"));
        out.write("Write the string to text file");
        out.newLine();


        //taip neveikia - failas tuscias
        while(reader.hasNext()){
            //System.out.println(reader.nextLine());
            String line = reader.nextLine();
            String naujaEilute = "/n";
            System.out.println(line);

            //copiedFile.write(line);
            out.write(line);
            out.newLine();
        }






        /* Cia budas su FileOutputStream*/
        FileOutputStream fos = new FileOutputStream("java_is_desktop.txt");
        DataOutputStream outStream = new DataOutputStream(new BufferedOutputStream(fos));



        while(reader.hasNext()){
            //System.out.println(reader.nextLine());
            String line = reader.nextLine();
            String naujaEilute = "/n";
            System.out.println(line);

            fos.write(line.getBytes(), 0, line.length());

            //copiedFile.write(line);
            //outStream.writeUTF(line);
            //outStream.writeUTF(naujaEilute);
        }
        fos.close();
        outStream.close();
    }
}
