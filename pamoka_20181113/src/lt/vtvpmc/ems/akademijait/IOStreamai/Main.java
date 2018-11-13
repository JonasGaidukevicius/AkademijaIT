package lt.vtvpmc.ems.akademijait.IOStreamai;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("tekstas.txt");
                FileOutputStream fos = new FileOutputStream("naujas_tekstas.txt")){


            while(fis.available() > 0){
                System.out.println(fis.read()); // atspausdina baitų reikšmę
                System.out.println((char) fis.read()); // atspaudina characterius
                int byteRead = fis.read();
                fos.write(byteRead);
                String testas = "Labas";
                fos.write("Testas".getBytes()); //konvertuoju stringą į baitus ir įrašau į failą

                Writer writer = new OutputStreamWriter(fos); // Writer tipo kintamasis jau moka rašyti pačius stringus į failą
                writer.write("aaaaaaaaaa");
                writer.flush(); //uždaro atidarytą streamą?? Nežinau, bet į failą įrašo

            }


        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
