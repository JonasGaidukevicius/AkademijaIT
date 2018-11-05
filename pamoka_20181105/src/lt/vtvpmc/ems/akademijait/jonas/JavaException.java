package lt.vtvpmc.ems.akademijait.jonas;

public class JavaException {
    public static void main(String[] args) {
        //Unchecked exceptions

        try{
            System.out.println(5/0);
        } catch (ArithmeticException e){
            System.out.println("Neteisinga! " + e);
        }





    }
}
