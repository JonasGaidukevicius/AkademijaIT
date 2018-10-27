package lt.vtvpmc.ems.akademijait.jonas;

import java.util.Arrays;

public class KeiciuDvejetainiIString11 {

    public static void main(String[] args) {
        String dvejetainis = "01010101";

        System.out.println(keiciuDvejetainiKodaIString(dvejetainis));
        System.out.println(binaryToString(dvejetainis));
    }

    //1 variantas
    public static String binaryToString(String value){
        //atskirti binarinius kodus tarpu
        String[] value2 = value.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < value2.length; i++){
            //parse the binary (base 2) number value2[i]. Then cast Integer value to char
            sb.append((char)Integer.parseInt(value2[i],2));
        }
        return sb.toString();
    }




    //2variantas

    public static String keiciuDvejetainiKodaIString(String dvejetainis){
        StringBuilder sb = new StringBuilder(); // Some place to store the chars
        Arrays.stream( // Create a Stream
                dvejetainis.split("(?<=\\G.{8})")).forEach(s -> sb.append((char) Integer.parseInt(s, 2)));
                // Splits the input string into 8-char-sections (Since a char has 8 bits = 1 byte)
         // Go through each 8-char-section...
                 // ...and turn it into an int and then to a char

        String output = sb.toString(); // Output text (t)
        return output;
    }
}
