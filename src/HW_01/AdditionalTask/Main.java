package HW_01.AdditionalTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Adress ad = new Adress();
        Scanner in = new Scanner(System.in);
        int argI;
        String argS;

        System.out.print("Введите свой индекс -> ");
        argI = in.nextInt();
        ad.setIndex(argI);

        System.out.print("Введите свою страну -> ");
        argS = in.next();
        ad.setCountry(argS);

        System.out.print("Введите свой город -> ");
        argS = in.next();
        ad.setCity(argS);

        System.out.print("Введите название улицы -> ");
        argS = in.next();
        ad.setStreet(argS);

        System.out.print("Введите номер дома -> ");
        argI = in.nextInt();
        ad.setHouse(argI);

        System.out.print("Введите номер квартиры -> ");
        argI = in.nextInt();
        ad.setAppartment(argI);

        System.out.println("******************");
        System.out.println("Ваш индекс: " + ad.getIndex());
        System.out.println("Ваша страна: " + ad.getCountry());
        System.out.println("Ваш город: " + ad.getCity());
        System.out.println("Ваша улица: " + ad.getStreet());
        System.out.println("Ваш дом: " + ad.getHouse());
        System.out.println("Ваша квартира: " + ad.getAppartment());


    }
}
