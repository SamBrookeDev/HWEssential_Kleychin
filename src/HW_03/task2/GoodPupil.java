package HW_03.task2;

public class GoodPupil extends Pupil {
    @Override
    void study() {
        System.out.print("Хорошо учится");
    }
    @Override
    void read() {
        System.out.print("быстро читает");
    }
    @Override
    void write() {
        System.out.print("при письме редко ошибается");
    }
    @Override
    void relax() { System.out.print("иногда отдыхает");
    }
}
