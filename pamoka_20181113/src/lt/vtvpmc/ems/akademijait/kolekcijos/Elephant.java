package lt.vtvpmc.ems.akademijait.kolekcijos;

import java.util.Objects;

public class Elephant implements Comparable<Elephant>{
    private String name;
    private double weight;

    public Elephant(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Elephant)) return false;
        Elephant elephant = (Elephant) o;
        return Objects.equals(getName(), elephant.getName());
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public int compareTo(Elephant other) {

        return this.getName().compareTo(other.getName());
    }
}


