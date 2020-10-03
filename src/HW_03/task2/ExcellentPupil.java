package HW_03.task2;

public class ExcellentPupil extends Pupil {
    @Override
    void study() {
        System.out.print("Отлично учится");
    }

    @Override
    void read() { System.out.print("очень быстро читает");
    }

    @Override
    void write() { System.out.print("пишет безупречно");
    }

    @Override
    void relax() {
        System.out.print("отдыхает читая");
    }
}
