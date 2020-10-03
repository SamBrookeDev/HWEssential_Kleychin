package HW_03.task3;

import java.util.Scanner;

public class Plane extends Vehicle {

    private int height;
    private int passengers;

    public void mainP() {

        Scanner in = new Scanner(System.in);
        System.out.print("Введте высоту транспортного средства -> ");
        height = in.nextInt();

        System.out.print("Введте количество пассажиров -> ");
        passengers = in.nextInt();
    }

    @Override
    public void mainOut() {
        super.mainOut();
    }

    public void mainOutP() {
        System.out.print("Высота транспортного средства равна -> " + height);
        System.out.print("\n");

        System.out.print("Количество пассажиров равно -> " + passengers);
        System.out.print("\n");
    }
}
