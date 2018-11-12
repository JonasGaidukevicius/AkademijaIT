package lt.vtvpmc.ems.akademijait.serializacija;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 2192520475174985497L;
    //private static final long serialVersionUID = 808706800648877903L;
    //private transient int id; // transiet padaro taip, kad šio objekto lauko serializuoti negalima
    private int id;
    private String name;
    private int age;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
