package lt.vtvpmc.ems.akademijait.jonas;

public class KeiciuStringIDvejetaini {
    public static void main(String[] args) {
        String eilute = "Eilute";
        System.out.println(keiciuStringIDvejetainiKoda(eilute));
    }

    private static StringBuilder keiciuStringIDvejetainiKoda(String eilute) {

        byte[] bytes = eilute.getBytes();
        StringBuilder binary = new StringBuilder();
        for (byte b : bytes)
        {
            int val = b;
            for (int i = 0; i < 8; i++)
            {
                binary.append((val & 128) == 0 ? 0 : 1);
                val <<= 1;
            }
            binary.append(' ');
        }
        //System.out.println("'" + eilute + "' to binary: " + binary);
        return binary;

    }
}
