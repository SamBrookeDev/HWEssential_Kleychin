package HW_04.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** Проигрыватель ***");
        System.out.print("Введите функцию ( проиграть / записать) -> ");
        Scanner input = new Scanner(System.in);
        String value = input.next();
        switch (value) {
            case "проиграть": {
                Playable request1 = new Player();
//                Player request1 = new Player(); // Не совсем понятно. Такая форма записи точно так же работает. Только при вызове есть список всех методов (и первого и второго интерфейсов). Для чего это делается? чтобы не загружать память?
                request1.pPlay();
                request1.pPause();
                request1.pStop();
                break;
            }
            case "записать": {
                Recordable request2 = new Player();
//                Player request2 = new Player();
                request2.rRecord();
                request2.rPause();
                request2.rStop();
                break;
            }
            default: {
                System.out.println("Указана неверная функция");
                break;
            }
        }
    }
}
