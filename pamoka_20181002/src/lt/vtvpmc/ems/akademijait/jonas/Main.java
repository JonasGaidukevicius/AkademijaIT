package lt.vtvpmc.ems.akademijait.jonas;

public class Main {
    public static void main(String[] args) {
        // pasiaiskinti kaip veikia
        int in1 = 10;

        in1 = in1++ + ++in1;
        System.out.println(in1); //22

        in1 = 10;
        in1 = ++in1 + in1++; //22
        System.out.println(in1);

        in1 = 10;
        in1 = in1++ + in1++; //21
        System.out.println(in1);

        in1=10;
        in1 = in1++ + in1++ + in1++; //33
        System.out.println(in1);

        in1 = 10;
        in1+= in1++ + in1-- + in1++;
        System.out.println(in1);


    }


}
