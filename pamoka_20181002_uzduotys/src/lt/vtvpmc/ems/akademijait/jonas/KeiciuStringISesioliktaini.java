package lt.vtvpmc.ems.akademijait.jonas;

public class KeiciuStringISesioliktaini {
    public static void main(String[] args) {
        String eilute = "Eilute";
        System.out.println(keiciuStringISesioliktainiKoda(eilute));

        System.out.println("-----Kiti budai versti desimtaini skaiciu i kitas sistemas");
        System.out.println(Integer.toBinaryString(21));
        System.out.println(Integer.toOctalString(21));
        System.out.println(Integer.toHexString(21));
    }

    public static StringBuilder keiciuStringISesioliktainiKoda(String eilute) {
        byte[] bytes = eilute.getBytes();
        StringBuilder sesioliktainis = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            sesioliktainis.append(Integer.toHexString(bytes[i]));
            sesioliktainis.append(' ');



        }


        return sesioliktainis;
    }
}
