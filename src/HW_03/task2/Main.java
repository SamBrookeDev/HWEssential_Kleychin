package HW_03.task2;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** Личные дела учеников ***");
            Pupil I = new ExcellentPupil();
            Pupil II = new ExcellentPupil();
            Pupil III = new GoodPupil();
            Pupil IV = new BadPupil();
        ClassRoom starter = new ClassRoom(I, II, III, IV);

    }
}
