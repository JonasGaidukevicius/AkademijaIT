package lt.vtvpmc.ems.akademijait.jonas;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        //createNewFile();
        //createNewDirectory();
        //createTempFile();
        renameFile();
        deleteFile();
    }

    private static void createNewFile(){
        File file = new File("homer/test.txt");
        try{
            boolean bool = file.createNewFile();
            System.out.println("File created " + bool);
        } catch (IOException e){
            System.out.println(e);
            e.printStackTrace();
        }
    }

    private static void createNewDirectory() throws IOException {
        File file = new File("Java");
        boolean bool = file.mkdir();
        System.out.println("Directory created " + bool);
    }


    private static void createTempFile() throws IOException{
        File tempFile = File.createTempFile("tmp", ".tmp");
        System.out.println("File path: " + tempFile.getAbsolutePath());
        tempFile = File.createTempFile("tmp", null);
    }

    private static void renameFile() throws IOException{
        File selectedFile = new File ("testas.txt");
        selectedFile.createNewFile();
        selectedFile.renameTo(new File ("newtestas.txt"));

    }

    private static void deleteFile() throws IOException{
        File selectedFile = new File ("newtestas.txt");
        boolean bool = selectedFile.delete();
        System.out.println("File deleted - " + bool);
    }



}
