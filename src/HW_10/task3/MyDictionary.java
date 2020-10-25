package HW_10.task3;

import java.util.HashMap;
import java.util.Map;

public class MyDictionary<TKey, TValue> {
    Map<TKey, TValue> map = new HashMap<>();

    public void add(TKey key, TValue value) {
        map.put(key, value);
    }

    public void get(TKey key) {
        System.out.println(map.get(key));
    }

    public void getSize() {
        System.out.println(map.size());
    }
}
