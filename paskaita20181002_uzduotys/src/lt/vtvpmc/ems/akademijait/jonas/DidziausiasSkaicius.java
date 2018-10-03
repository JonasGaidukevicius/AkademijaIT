package lt.vtvpmc.ems.akademijait.jonas;

public class DidziausiasSkaicius {
    public static void main(String[] args) {
        int[] masyvas = {10, 2, 6, 15, 48, 1};
        int max = ieskauDidziausioSkaiciaus(masyvas);
        System.out.println(max);
    }

    public static int ieskauDidziausioSkaiciaus(int[] masyvas) {
        int max = masyvas[0];
        for(int i : masyvas){
            if(max < i){
                max = i;
            }
        }
        return max;
    }
}
