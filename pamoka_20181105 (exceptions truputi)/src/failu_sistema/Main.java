package failu_sistema;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean operates = true;
        String[] realCommand;
        String destination = "";
        FileSystem catalogue = new FileSystem();
        catalogue.readingDirectory();
        while (operates){
            realCommand = iveskKomanda().split(" ");
            for(String s : realCommand){
                System.out.println(s);
            }
            //catalogue.currentDirectory = realCommand[1];
            catalogue.currentDirectory = new File(realCommand[1]);
            catalogue.readingDirectory();

        }


    }

    public static String iveskKomanda(){
        Scanner input = new Scanner(System.in);
        System.out.print("Ivesk komanda: ");
        String komanda = input.nextLine();
        //System.out.println(komanda);
        return komanda;

    }






}
