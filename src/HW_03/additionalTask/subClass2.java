package HW_03.additionalTask;

public class subClass2 extends Printer {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";

    @Override
    void print(String value) {
        System.out.println(ANSI_GREEN + value + ANSI_RESET);
    }
}
