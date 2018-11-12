package lt.vtvpmc.ems.akademijait.lt.vtvpmc.ems.akademijait.streamai;

public class Box {
    private float weight;


    public Box(float weight){
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Box{" +
                "weight=" + weight +
                '}';
    }
}
