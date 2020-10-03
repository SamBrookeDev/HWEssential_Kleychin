package HW_01.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double argument, result;
        Rectangle rect = new Rectangle();
        Scanner input = new Scanner(System.in);

        System.out.print("Введите длину прямоугольника -> ");
        argument = input.nextDouble();
        rect.setSide1(argument);
        System.out.print("Введите ширину прямоугольника -> ");
        argument = input.nextDouble();
        rect.setSide2(argument);

        result = rect.AreaCalculator();
        System.out.print("Площадь прямоугольника равна: " + result);
        System.out.print("\n");
        result = rect.PerimeterCalculator();
        System.out.print("Периметр прямоугольника равен: " + result);



    }
}
