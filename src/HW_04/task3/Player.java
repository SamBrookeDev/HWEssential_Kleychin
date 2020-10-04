package HW_04.task3;

public class Player implements Playable, Recordable {
    public void pPlay() {
        System.out.println("Идет проигрывание");
    }

    public void pPause() {
        System.out.println("Проигрывание поставлено на паузу");
    }

    public void pStop() {
        System.out.println("Проигрывание остановлено");
    }

    public void rRecord() {
        System.out.println("Идет запись");
    }

    public void rPause() {
        System.out.println("Запись поставлена на паузу");
    }

    public void rStop() {
        System.out.println("Запись остановлена");
    }
}
