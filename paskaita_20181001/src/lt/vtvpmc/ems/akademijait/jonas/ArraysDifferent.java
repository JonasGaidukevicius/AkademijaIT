package lt.vtvpmc.ems.akademijait.jonas;

import java.util.Arrays;

public class ArraysDifferent {

    public static void main(String[] args) {
        System.out.println();
        randomArray(10);

    }

    // 3 budai pereiti ir atspausdinti masyvo elementus
    public static void randomArray(int size){
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (int) (Math.random() * 100);
        }
        System.out.print(numbers + "\n");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        for(int elements : numbers){
            System.out.print(elements + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(numbers));

        //masyvo nukopijavimas
        int[] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        System.out.println(numbersCopy);
        System.out.println(Arrays.toString(numbersCopy));

        searchMaxNumber(numbers);

    }

    public static void searchMaxNumber (int[] number){
        int maxValue = 0;
        for(int i = 0; i < number.length; i++){
            if(maxValue < number[i]){
                maxValue = number[i];
            }
        }
        System.out.println(maxValue);
    }
}
