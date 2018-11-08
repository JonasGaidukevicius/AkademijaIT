package lt.vtvpmc.ems.akademijait.logging2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class JavaLogging2 {
    private static final Logger logger = LogManager.getLogger(JavaLogging2.class.getName());

    public static void main(String[] args) throws IOException{
        logger.info("Pranešimas iš INFO lygmens");
        createNewFile();
    }

    private static void createNewFile(){
        File file = new File("homer/test.txt");
        try{
            boolean bool = file.createNewFile();
            System.out.println("File created " + bool);
        } catch (IOException e){
            logger.info("Failas nebuvo sukurtas, nes nėra tokios direktorijos");
            //System.out.println(e);
            //e.printStackTrace();
        }
    }


}
