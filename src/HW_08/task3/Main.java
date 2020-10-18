package HW_08.task3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Price[] market = new Price[2];
        System.out.println("*** Price ***");
        for (int i = 0; i < market.length; i++) {
            Scanner inner = new Scanner(System.in);
            System.out.print("Введите наименование магазина №" + (i+1) + " -> ");
            String marketName = inner.next();
            System.out.print("Введите наименование товара -> ");
            String productName = inner.next();
            System.out.print("Введите стоимость товара (в гривнах) -> ");
            int price = inner.nextInt();
            market[i] = new Price(productName, marketName, price);
        }
        System.out.println();
        Arrays.sort(market);
        System.out.println("Список магазинов в алфавитном порядке:");
        for (Price tmp : market
        ) {
            System.out.println(tmp.marketName);
        }
        System.out.print("Введите названия магазина для отбора -> ");
        Scanner in = new Scanner(System.in);
        String check = in.next();
        for (Price tmp : market
        ) {
            if (check.equals(tmp.marketName)) {
                System.out.println(tmp);
            } else {
                try {
                    throw new Exception("Введенное название магазина отсутвует");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

        }
    }
}
