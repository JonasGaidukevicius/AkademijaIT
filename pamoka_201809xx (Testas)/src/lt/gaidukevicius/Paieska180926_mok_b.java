package lt.gaidukevicius;

public class Paieska180926_mok_b {

    public static void main(String[] args){
        int[] masyvas = {10, 9, 15, 46, 99, 2, 26, 9, 47, 100};
        int rasti = 9;

        linearSearch(masyvas, rasti);


    }

    public static void linearSearch(int[] arr, int searchNumber){
        int size = arr.length;
        for(int i = 0; i < size; i++){
            if(arr[i] == searchNumber){
                System.out.println(i);;
            }
        }
    }
}
