package lt.vtvpmc.ems.akademijait.namu_darbai;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RunCode {
    public static void main(String[] args) {
        List<EvenNumbers> evenNumbersList = new ArrayList<>();

        for (int i = 1; i <= 20; i++){
            evenNumbersList.add(new EvenNumbers(generateEvenNumber()));

        }
        for (EvenNumbers num: evenNumbersList) {
            System.out.print(num.getEvenNumber()+ " ");

        }
        System.out.println();


        evenNumbersList
                .stream()
                .filter((number) -> number.getEvenNumber() % 3 == 0)
                .mapToInt((number) -> number.getEvenNumber() + 1)
                .forEach((number) -> System.out.print(number + ", "));

        System.out.println();

    }


    public static int generateEvenNumber(){
        Random rand = new Random();
        int evenNumber = 0;
        while(true){
            evenNumber = rand.nextInt(100) + 1;
            if(evenNumber % 2 == 0){
                return evenNumber;
            }
        }
    }
}
