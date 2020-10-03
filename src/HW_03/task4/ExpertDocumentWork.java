package HW_03.task4;

public class ExpertDocumentWork extends ProDocumentWorker {
    @Override
    public void openDocument() {
        System.out.println("Документ открыт");
    }

    @Override
    public void editDocument() {
        System.out.println("Документ отредактирован");
    }

    @Override
    public void saveDocument() {
        System.out.println("Документ сохранен в новом формате");
    }
}
