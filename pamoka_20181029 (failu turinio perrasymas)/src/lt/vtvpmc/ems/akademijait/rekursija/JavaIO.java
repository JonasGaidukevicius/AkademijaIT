package lt.vtvpmc.ems.akademijait.rekursija;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JavaIO {
    public static void main(String[] args) throws Exception{
        //bufferReader();
        systemInReader();
        inputStreamReder();
    }

    public static void bufferReader() throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //System.in duoda baitus
        //InputStreamReader paverčia baitus į charus
        //BufferedReader paverčia charus į Stringą

        String line = bufferedReader.readLine();
        System.out.println(line);
        bufferedReader.close();

    }


    //metodas, kad įsitikinti, kad System.in duoda baitus
    public static void systemInReader() throws Exception{
        for(;;){
            int byteValue = System.in.read();
            if(byteValue == 48){//įvedus 0
                break;
            }
            System.out.println(byteValue);

        }
    }


    //metodas, kad įsitikinti, kad InputStreamReader dirba su charais
    public static void inputStreamReder() throws Exception{
        for(;;){
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            int charValue = inputStreamReader.read();
            System.out.println(charValue);
            //inputStreamReader.close();
        }



    }

}
