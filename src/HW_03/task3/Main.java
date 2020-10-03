package HW_03.task3;


public class Main {
    public static void main(String[] args) {
        int argument;
        String string;
        System.out.println("*** Контроль транспорта ***");
        Car car = new Car();
        Ship ship = new Ship();
        Plane plane = new Plane();

        System.out.println("*** Автомобиль ***");
        car.main();
        System.out.println("*** Лодка ***");
        ship.main();
        ship.mainS();
        System.out.println("*** Самолет ***");
        plane.main();
        plane.mainP();
        System.out.println("*** Автомобиль ***");
        car.mainOut();
        System.out.println("*** Лодка ***");
        ship.mainOut();
        ship.mainOutS();
        System.out.println("*** Самолет ***");
        plane.mainOut();
        plane.mainOutP();


    }
}
