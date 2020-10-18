package HW_08.task3;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Price implements Comparable{
    String productName;
    String marketName;
    int price;

    public Price(String productName, String marketName, int price) {
        this.productName = productName;
        this.marketName = marketName;
        this.price = price;
    }


    @Override
    public int compareTo(Object o) {
        return this.marketName.compareTo(((Price)o).marketName);
    }
    @Override
    public String toString() {
        return marketName;
    }
}
