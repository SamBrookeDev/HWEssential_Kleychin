package HW_10.task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.methodAdd("Hello");
        list.methodAdd("My");
        list.methodAdd("Name");
        list.methodAdd("is");
        list.methodAdd("Simon");
        System.out.println(list.getList());
//        System.out.println();
        list.gClass();
        list.readSize();
        list.methodGet(2);
    }
}
