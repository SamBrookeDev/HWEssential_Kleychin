package HW_03.additionalTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово -> ");
        String value = in.next();
        Printer print0 = new Printer();
        print0.print(value);
        subClass1 print1 = new subClass1();
        print1.print(value);
        subClass2 print2 = new subClass2();
        print2.print(value);
        subClass3 print3 = new subClass3();
        print3.print(value);
    }
}
