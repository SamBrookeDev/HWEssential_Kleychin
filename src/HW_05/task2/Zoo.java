package HW_05.task2;

import java.util.ArrayList;
import java.util.ListIterator;

public class Zoo {
    public void getAnimals() {
        ArrayList<String> animals = new ArrayList<>();
        animals.add(0, "Lion");
        animals.add(1, "Tiger");
        animals.add(2, "Turtle");
        animals.add(3, "Bear");
        animals.add(4, "Bird");
        animals.add(5, "Owl");
        animals.add(6, "Zebra");
        animals.add(7, "Bat");

        ListIterator<String> listIterator = animals.listIterator();
        while (listIterator.hasNext()) {
            String value = listIterator.next();
            System.out.println(value);

        }


    }

}
