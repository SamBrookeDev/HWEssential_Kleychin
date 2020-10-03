package HW_03.task3;

import java.util.Scanner;
import java.util.SortedMap;

public class Vehicle {
    private int price;
    private int speed;
    private int yearOfManufacture;

    public void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введте цену транспортного средства -> ");
        price = in.nextInt();

        System.out.print("Введте скорость транспортного средства -> ");
        speed = in.nextInt();

        System.out.print("Введте год выпуска транспортного средства -> ");
        yearOfManufacture = in.nextInt();
    }

    public void mainOut() {
        System.out.print("Цена транспортного средства равна -> " + price);
        System.out.print("\n");

        System.out.print("Скорость транспортного средства равна -> " + speed);
        System.out.print("\n");

        System.out.print("Год выпуска транспортного средства равна -> " + yearOfManufacture);
        System.out.print("\n");
    }
}
