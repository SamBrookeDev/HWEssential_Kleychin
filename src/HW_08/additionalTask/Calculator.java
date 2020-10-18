package HW_08.additionalTask;

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
            case "+": {
                coreCalculator.add(a1, a2);
                break;
            }
            case "-": {
                coreCalculator.sub(a1, a2);
                break;
            }
            case "/": {
                coreCalculator.div(a1, a2);
                break;
            }
            case "*": {
                coreCalculator.mul(a1, a2);
                break;
            }
        }
    }

    static class coreCalculator {
        static void add(int a, int b) {
            int result = a + b;
            System.out.println("Result = " + result);
        }

        static void sub(int a, int b) {
            int result = a - b;
            System.out.println("Result = " + result);
        }

        static void div(int a, int b) {
            try {
                if (b == 0) {
                    int result = a / b;
                } else {
                    double result = (double) a / b;
                    System.out.println("Result = " + result);
                }
            } catch (Exception e) {
                System.out.println("Обработка исключения");
                System.out.println(e.getMessage());
            }

        }

        static void mul(int a, int b) {
            int result = a * b;
            System.out.println("Result = " + result);
        }
    }
}
