package lt.vtvpmc.ems.akademijait.jonas;

import sun.text.normalizer.UTF16;

public class KeiciuStringIDvejetaini10 {
    public static void main(String[] args) {
        String eilute = "Eilute";
        System.out.println(keiciuStringIDvejetainiKoda(eilute));
    }

    public static StringBuilder keiciuStringIDvejetainiKoda(String eilute) {



        byte[] bytes = eilute.getBytes();
        //System.out.println(bytes[0]);  testinis atsispausdinimas
        StringBuilder binary = new StringBuilder();
        for (byte b : bytes)
        {
            int val = b;
            for (int i = 0; i < 8; i++)
            {
                binary.append((val & 128) == 0 ? 0 : 1); //nesuprantu sito mechanizmo
                val <<= 1;
                //System.out.println("Val yra " + val);
            }
            binary.append(' ');
        }
        //System.out.println("'" + eilute + "' to binary: " + binary);
        return binary;

    }
}
