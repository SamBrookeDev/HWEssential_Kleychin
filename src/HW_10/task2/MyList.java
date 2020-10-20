package HW_10.task2;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> {

    List<T> list = new ArrayList<>();

    public List<T> getList() {
        return list;
    }

    public void gClass() {
        System.out.println(list.getClass());
    }

    public void methodAdd(T arg) {
        list.add(arg);
    }

    public void methodGet(int index) {
        System.out.println(list.get(index));
    }

    public void readSize() {
        System.out.println(list.size());
    }

}
