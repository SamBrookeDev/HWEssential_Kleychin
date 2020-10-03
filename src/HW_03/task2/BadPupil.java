package HW_03.task2;

public class BadPupil extends Pupil {
    @Override
    void study() {
        System.out.print("Плохо учится");
    }
    @Override
    void read() {
        System.out.print("медленно читает");
    }
    @Override
    void write() {
        System.out.print("пишет с большикм количеством ошибок");
    }
    @Override
    void relax() {
        System.out.print("постоянно отдыхает");
    }
}
