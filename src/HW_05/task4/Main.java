package HW_05.task4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integer = new ArrayList<>();
        integer.add(1);
        integer.add(2);
        integer.add(3);
        integer.add(4);
        integer.add(5);
        integer.add(6);

        ListIterator<Integer> listIterator = integer.listIterator();
        while (listIterator.hasNext()) {
            int value = listIterator.next() + 1;
            System.out.println(value);
        }

    }
}
