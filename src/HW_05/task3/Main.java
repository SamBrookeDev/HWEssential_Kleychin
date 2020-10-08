package HW_05.task3;

import HW_05.task2.Zoo;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main extends Zoo {
    @Override
    public void getAnimals() {
//        super.getAnimals();
        ArrayList<String> animals = new ArrayList<>();
        animals.remove("Turtle");
        animals.remove("Bird");
        animals.remove("Zebra");
        int size = animals.size();
        System.out.println("Длина списочного массива равна " + size);
    }

    public static void main(String[] args) {
        Zoo newZoo = new Zoo();
        newZoo.getAnimals();

    }
}
