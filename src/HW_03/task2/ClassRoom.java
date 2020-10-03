package HW_03.task2;

public class ClassRoom {

    public ClassRoom(Pupil I, Pupil II, Pupil III, Pupil IV) {
        Pupil[] array = {I, II, III, IV};
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ученик № " + i + "-> ");
            array[i].study();
            System.out.print(", ");
            array[i].read();
            System.out.print(", ");
            array[i].write();
            System.out.print(", ");
            array[i].relax();
            System.out.print("\n");
        }
    }

    public ClassRoom(Pupil I, Pupil II, Pupil III) {
        Pupil[] array = {I, II, III};
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ученик № " + i + "-> ");
            array[i].study();
            System.out.print(", ");
            array[i].read();
            System.out.print(", ");
            array[i].write();
            System.out.print(", ");
            array[i].relax();
            System.out.print("\n");
        }
    }

    public ClassRoom(Pupil I, Pupil II) {
        Pupil[] array = {I, II};
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ученик № " + i + "-> ");
            array[i].study();
            System.out.print(", ");
            array[i].read();
            System.out.print(", ");
            array[i].write();
            System.out.print(", ");
            array[i].relax();
            System.out.print("\n");
        }
    }
}
