package HW_06.additionalTask;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** Calculator ***");
        System.out.print("Input first argument -> ");
        int a1 = input.nextInt();
        System.out.print("Input operation (ex. + - / *) -> ");
        String op = input.next();
        System.out.print("Input second argument -> ");
        int a2 = input.nextInt();
        switch (op) {
            case "+" : {
                coreCalculator.sum(a1,a2);
                break;
            }
            case "-" : {
                coreCalculator.sub(a1,a2);
                break;
            }
            case "/" : {
                coreCalculator.div(a1,a2);
                break;
            }
            case "*" : {
                coreCalculator.mult(a1,a2);
                break;
            }
        }
    }

    static class coreCalculator {
        static void sum(int a, int b) {
            int result = a + b;
            System.out.println("Result = " + result);
        }
        static void sub(int a, int b) {
            int result = a - b;
            System.out.println("Result = " + result);
        }
        static void div(int a, int b) {
            if (b == 0) {
                System.out.println("Operation stopped. Division by zero");
            }
            else {
                double result = (double) a / b;
                System.out.println("Result = " + result);
            }
        }
        static void mult(int a, int b) {
            int result = a * b;
            System.out.println("Result = " + result);
        }
    }
}
