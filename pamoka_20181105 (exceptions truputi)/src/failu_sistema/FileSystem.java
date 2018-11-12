package failu_sistema;

import java.io.File;

public class FileSystem {
    File homeDirectory;
    File currentDirectory;

    public FileSystem(){
        homeDirectory = new File("/home");
        currentDirectory = new File("/home");
    }

    public void readingDirectory(){
        //FileSystem startingPoint = new FileSystem();
        String[] directoryList = this.currentDirectory.list();
        //System.out.println("getname yra " + currentDirectory.getName());


        for(String s : directoryList){
            System.out.println(s);
        }
        //System.out.println(failuSistema.list());
    }


    public void changingDirectory(String chosenDirectory ){

    }
}
