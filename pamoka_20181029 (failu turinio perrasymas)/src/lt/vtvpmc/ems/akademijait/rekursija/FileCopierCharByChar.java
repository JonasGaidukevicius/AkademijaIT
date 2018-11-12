package lt.vtvpmc.ems.akademijait.rekursija;

import java.io.*;

public class FileCopierCharByChar {

    public static void main(String[] args) throws Exception{
        InputStreamReader isr = new InputStreamReader(new FileInputStream("java.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("java_byte.txt"));

        try{
            int stack;
            while((stack = isr.read()) != -1){
                osw.write(stack);
            }
        }   catch (FileNotFoundException e){
            System.out.println(e);
        } finally {
            if(isr != null){
                isr.close();
            }
            if(osw != null) {
                osw.close();
            }
        }




    }
}
