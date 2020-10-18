package HW_08.task2;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.regex.MatchResult;

public class Main {

    public static void main(String[] args) {
        String surname;
        String position;
        LocalDate hireDate = null;
        int presentYear = 2020;
        System.out.println("*** Список сотрудников ***");
        Worker[] worker = new Worker[5];

        for (int i = 0; i < worker.length; i++) {
            Scanner in = new java.util.Scanner(System.in);
            Scanner date = new java.util.Scanner(System.in);

            System.out.print("Введите Фамилию -> ");
            surname = in.next();
            System.out.print("Введите должность сотрудника -> ");
            position = in.next();
            System.out.print("Введите дату найма сотрудника -> ");
            date.findInLine("(\\d\\d)\\.(\\d\\d)\\.(\\d\\d\\d\\d)");
            try {
                MatchResult mr = date.match();
                int month = Integer.parseInt(mr.group(2));
                int day = Integer.parseInt(mr.group(1));
                int year = Integer.parseInt(mr.group(3));

                hireDate = LocalDate.of(year, month, day);
//            System.out.println(hireDate);
            } catch (
                    IllegalStateException e) {
                System.err.println("Invalid input!");
            } catch (IndexOutOfBoundsException e) {
                System.err.println("Invalid input!");
            }
            worker[i] = new Worker(surname, position, hireDate);
        }
        Arrays.sort(worker);
        System.out.println("Список сотрудников по алфавиту:");
        for (Worker tmp : worker
        ) {
            System.out.println(tmp);
        }


        Scanner stage = new Scanner(System.in);
        System.out.print("Введите максимальный стаж -> ");
        int maxStage = stage.nextInt();

        for (int i = 0; i < worker.length; i++) {

            int checkDate = worker[i].hireDate.getYear();
            if ((presentYear - checkDate) > maxStage) {
                try {
                    throw new Exception("Стаж сотрудника " + worker[i].surname + " вышел за пределы");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Стаж сотрудников в заданных пределах");
            }

        }


    }


}

