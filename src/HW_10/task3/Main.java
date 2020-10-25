package HW_10.task3;

public class Main {
    public static void main(String[] args) {
        MyDictionary<Integer, String> dict = new MyDictionary<>();
        dict.add(1, "Арнольд");
        dict.add(2, "Джеральд");
        dict.add(3, "Хельга");
        System.out.println("-------------------");
        dict.get(3);
        dict.getSize();

    }
}
