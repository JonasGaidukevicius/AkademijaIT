package lt.vtvpmc.ems.akademijait.jono_adaperis;

public class RunApp {
    public static void main(String[] args) {

        System.out.println("----  Originalus variantas -----");
        MakingCalculations firstCalculation = new MakingCalculations();


        System.out.println(firstCalculation.addingTwoNumbers(new OldCalculator()));

        System.out.println("----- Variantas po adapterio ------");

        MakingCalculations secondCalculation = new MakingCalculations();
        System.out.println( secondCalculation.addingTwoNumbers(new OldToNewAdapter(new NewCalculator())));



    }
}
