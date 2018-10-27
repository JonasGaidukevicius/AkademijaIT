package lt.vtvpmc.ems.akademijait.jonas;

public class KeisciuStringIAstuntaini {
    public static void main(String[] args) {
        String eilute = "Eilute";
        System.out.println(keiciuStringIAstuntainiKoda(eilute));
    }

    public static StringBuilder keiciuStringIAstuntainiKoda(String eilute) {
        byte[] bytes = eilute.getBytes();
        StringBuilder astuntainis = new StringBuilder();
        for(int i = 0; i < bytes.length; i++){
            astuntainis.append(Integer.toString(bytes[i],8));
            astuntainis.append(' ');
        }


        return astuntainis;
    }
}
