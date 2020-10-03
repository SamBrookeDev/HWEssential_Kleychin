package HW_01.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Вариант 1 // Неверно понял ТЗ)

        String input;
        String[] value = new String[5]; // Создаем массив дла хранения значений
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < value.length; i++) { // Считываем значения, введенные пользователем и записываем их в массив
            System.out.print("Введите название модели-> ");
            value[i] = in.next();
        }
//      for (int i = 0; i < value.length; i++) { // Проверка записанных значений
//          System.out.print(value[i] + " ");
//      }

        Computer[] computers = new Computer[5]; // Создаем массив объектов класса
        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer();
            computers[i].setValue(value[i]); // Запись значений первого массива в ячейуи второго
        }
        for (int i = 0; i < computers.length; i++) { // Вывод на экран значений второго массива
            System.out.print(computers[i].getValue() + " ");
        }
    }


}
