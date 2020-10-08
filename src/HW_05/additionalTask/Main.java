package HW_05.additionalTask;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("Sharova I.V.");
        teachers.add("Ovcharenko N.R.");
        teachers.add("Netcvetova O.I.");
        teachers.add("Fomenko A.A.");
        teachers.add("Doinova T.L.");
        teachers.add("Dolgopolova O.V.");
        teachers.add("R.B.");
        teachers.add("Shelyak A.A.");

        int bad = teachers.indexOf("Fomenko A.A.");
        int good = teachers.indexOf("Sharova I.V.");
        System.out.println("Номер плохого преподавателя из списка -> " + bad);
        System.out.println("Номер хорошего преподавателя из списка -> " + good);

        ListIterator<String > stringListIterator = teachers.listIterator();
        while (stringListIterator.hasNext()){
            String value = stringListIterator.next();
            System.out.println(value);
        }
    }
}
