package lt.vtvpmc.ems.akademijait.generic;

import lt.vtvpmc.ems.akademijait.serializacija.Person;

public class GenericsMain {
    public static void main(String[] args) {
        StringBox stringBox = new StringBox(1, "Tomas");


        Box<String> box = new Box<>("Hello", "World");
        Box<Integer> integerBox = new Box<>(1, 2);
        Box<Person> personBox = new Box<>(new Person(1, "Tomas"), new Person(2, "Petras"));

        Box2<Integer, String> peopleList = new Box2<>(1, "Tomas");
    }
}
