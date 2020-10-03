package HW_03.task3;

import java.util.Scanner;

public class Ship extends Vehicle {
    private int passengers;
    private String port;

    public void mainS() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введте порт базирования -> ");
        port = in.next();

        System.out.print("Введте количество пассажиров -> ");
        passengers = in.nextInt();


    }

    @Override
    public void mainOut() {
        super.mainOut();
    }

    public void mainOutS() {
        System.out.print("Количество пассажиров равно -> " + passengers);
        System.out.print("\n");

        System.out.print("Порт базирования судна -> " + port);
        System.out.print("\n");
    }
}
