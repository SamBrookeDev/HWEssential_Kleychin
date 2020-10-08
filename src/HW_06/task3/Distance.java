package HW_06.task3;

import java.util.Scanner;

public class Distance {
    private double distance;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** Конвертер расстояния ***");
        System.out.println("============================");

        System.out.print("Введите расстояние (в метрах) -> ");
        int meters = input.nextInt();
        System.out.println("Введите метод конвертации: 1 - мили, 2 - километры");
        String method = input.next();

        switch (method) {
            case "1" : {
                Converter.miles(meters);
                break;
            }
            case "2" : {
                Converter.kilometers(meters);
                break;
            }
        }

    }

    static class Converter {
        static void miles(int m) {
            double result = (double) m * 0.00062;
            System.out.println("Расстояние " + m + " м равно " + result+ " миль");
        }

        static void kilometers(int m) {
            double result = (double) m * 0.001;
            System.out.println("Расстояние " + m + " м равно " + result+ " километров");
        }

    }


}
