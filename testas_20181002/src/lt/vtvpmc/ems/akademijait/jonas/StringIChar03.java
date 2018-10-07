package lt.vtvpmc.ems.akademijait.jonas;

public class StringIChar03 {
    public static void main(String[] args) {
        String text = "Laba diena";
        char simbolis = text.charAt(0);
        System.out.println(simbolis);
        String newText = "";
        //newText += simbolis;
        newText = Character.toString(simbolis);
        System.out.println("Stringas is char - " + newText);


    }
}
