package lt.vtvpmc.ems.akademijait.rekursija;

import java.io.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BMIcalculator {
    public static void main(String[] args) throws IOException {
        calculatePeopleBMI();

    }

    public static void calculatePeopleBMI()throws IOException {
        int mass;
        double height; //in meter
        double bmi;
        String number;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input client number: ");
        number = bufferedReader.readLine();
        System.out.println("Input client mass: ");
        mass = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Input client height: ");
        height = Double.parseDouble(bufferedReader.readLine());

        bmi = mass / Math.pow(height, 2);
        //kai parašau į try bloką, tai automatiškai uždarys srautą
        try(FileOutputStream fileOutputStream = new FileOutputStream(number + ".txt", true)){
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            Date date = new Date();
            dataOutputStream.writeBytes("Date: " + date + "\n");
            dataOutputStream.writeBytes("Height: " + height+"\n");
            dataOutputStream.writeBytes("Mass: " + mass + "\n");
            dataOutputStream.writeBytes("BMI: " + bmi+ "\n");
            dataOutputStream.writeBytes("-----------------------" + "\n");
        } catch (FileNotFoundException e){
            // J.U.L loggeris - šiaip nenaudojamas, nes yra geresnių
            Logger.getLogger(BMIcalculator.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e){
            System.out.println("error " + e);
        } finally {
            //Čia reikia uždarinėti visus atidarytus srautus.
            //Tik šiuo atveju, FileOutputStream yra atidarytas try bloke, todėl jis bus uždarytas automatiškai.
            //Ir dart automatiškai uždaros visus susijusius srautus
            //Iš pradžių reikia uždaryti labiausiai vaikinį srautįą, o paskui ir visus kitus iki tėvinio
            System.out.println("Viskas pasibaigė");
        }




    }
}
