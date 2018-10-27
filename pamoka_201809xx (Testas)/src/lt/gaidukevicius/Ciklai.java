package lt.gaidukevicius;

public class Ciklai {
    public static void main(String[] args){
        int age = 12;
        String name = "Tomas";
        if(age <= 18 && name.equals("Tomas")){
            System.out.println("No alcohol");

        } else {
            System.out.println("Drink");
        }

        switch (age){
            case 15:
                System.out.println("Tėvai");
                break;
            case 21:
                System.out.println("Tinka");
                break;
            default:
                System.out.println("Default reiškinys");
        }
    }
}
