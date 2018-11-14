package lt.vtvpmc.ems.akadenmijait.jonas.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

public class JavaLogging {

    //Lygmenys:
    //ALL - paima visus pranešimus
    //TRACE -
    //DEBUG - nustatomi taškai, kurie man svarbūs ir iš ten pareina informacija
    //INFO
    //WARNING
    //ERROR
    //FATAL
    //OFF

    private final static Logger logger = LoggerFactory.getLogger(JavaLogging.class);
    //

    public static void main(String[] args) throws IOException {
        //logger.trace("Message from TRACE level");
        logger.info("Message from INFO level");
        logger.error("Error klaida");
        logger.warn("Warn pranesimas");
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



























