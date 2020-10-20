package HW_09.task2;

public class Main {
    public static void main(String[] args) {
        String manufacturer = "samsung";
        int price = 120;
        String serialNumber = "AB1234567CD";

        int resolutionX = 1280;
        int resolutionY = 1024;

        Device device = new Device();
        device.setManufacturer(manufacturer);
        device.setPrice(price);
        device.setSerialNumber(serialNumber);

        Monitor monitor = new Monitor();
        monitor.setManufacturer(manufacturer);
        monitor.setPrice(price);
        monitor.setSerialNumber(serialNumber);
        monitor.setResolutionX(resolutionX);
        monitor.setResolutionY(resolutionY);

        System.out.println(device);
        System.out.println(monitor);

        System.out.println(device.hashCode());
        System.out.println(monitor.hashCode());

        System.out.println(device.equals(monitor));


    }
}
