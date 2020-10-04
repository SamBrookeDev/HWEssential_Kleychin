package HW_04.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите имя документа с расширением");
        System.out.println("Например: Example.doc");
        Scanner in = new Scanner(System.in);
        String value; // Добавили объект, чтобы получить возможность узнать длину строки
        value = in.next(); // Записали в него значение с клавиатуры
        String end;
        end = value.substring(value.length()-3);

        switch (end) {
            case "doc" : {
                DOCHandler doc = new DOCHandler();
                doc.open();
                doc.create();
                doc.change();
                doc.save();
                break;
            }
            case "txt" : {
                TXTHandler txt = new TXTHandler();
                txt.open();
                txt.create();
                txt.change();
                txt.save();
                break;
            }
            case "xml" : {
                XMLHandler xml = new XMLHandler();
                xml.open();
                xml.create();
                xml.change();
                xml.save();
                break;
            }
        }

    }
}
