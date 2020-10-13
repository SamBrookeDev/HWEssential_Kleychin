package HW_07.additionalTask;

public class Main {
    public static void main(String[] args) {

    Vehicle firstVehicle = Vehicle.AUTO;
    Vehicle secondVehicle = Vehicle.MOTORCYCLE;
    Vehicle thirdVehicle = Vehicle.BIKE;

        System.out.println(firstVehicle.toString());
        System.out.println(secondVehicle.toString());
        System.out.println(thirdVehicle.toString());

        String a = firstVehicle.getColor();
        String b = secondVehicle.getColor();
        String c = thirdVehicle.getColor();

        System.out.print(a + " " + b + " " + c);

}
}
