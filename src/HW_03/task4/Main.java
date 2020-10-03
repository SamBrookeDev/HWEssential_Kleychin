package HW_03.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** Редактор документов ***");
        DocumentWorker def = new DocumentWorker();
        ProDocumentWorker pro = new ProDocumentWorker();
        ExpertDocumentWork exp = new ExpertDocumentWork();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ключ версии -> ");
        String key = in.next();

        switch (key) {
            case "pro": {
                pro.openDocument();
                pro.editDocument();
                pro.saveDocument();
                break;
            }
            case "expert": {
                exp.openDocument();
                exp.editDocument();
                exp.saveDocument();
                break;
            }
            default: {
                def.openDocument();
                def.editDocument();
                def.saveDocument();
                break;
            }
        }
    }
}
