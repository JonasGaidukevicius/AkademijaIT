package lt.vtvpmc.ems.akademijait.lt.vtvpmc.ems.akademijait.streamai;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream <Box> boxes = Stream.of(
                new Box (0.1f),
                new Box (0.6f),
                new Box (1.1f),
                new Box (0.2f)
        );

        //REIKIA ATSIKOMENTUOTI, kad PAMATYTI KĄ PADARO KODAS

        /*boxes
                .filter((box) -> box.getWeight() >= 0.5f)
                .map((box) -> box.getWeight())
                .forEach((box) -> System.out.println(box));*/

        //arba
        System.out.println("--Kitas variantas---");
        /*boxes
                .filter((box) -> box.getWeight() >= 0.5f)
                .forEach(System.out::println);*/

        System.out.println("--Kitas variantas---");
        double totalWeight = boxes
                .filter((box) -> box.getWeight() >= 0.5f)
                .mapToDouble((box) -> box.getWeight())
                .sum();
        System.out.println(totalWeight);

        System.out.println("--Kitas variantas---");

        List<Box> boxes1 = new ArrayList<>();
        boxes1.stream()
                .filter((box) -> box.getWeight() >= 0.5f)
                .mapToDouble((box) -> box.getWeight())
                .sum();

    }
}
