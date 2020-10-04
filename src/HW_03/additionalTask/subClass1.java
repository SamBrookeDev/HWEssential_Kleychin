package HW_03.additionalTask;

public class subClass1 extends Printer {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    @Override
    void print(String value) {
        System.out.println(ANSI_RED + value + ANSI_RESET);
    }
}
