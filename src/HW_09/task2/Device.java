package HW_09.task2;

public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device() {

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "manufacturer=" + manufacturer + ", price=" + price + ", serialNumber=" + serialNumber;
    }

    @Override
    public int hashCode() {
        final int root = 13;
        int result = 1;
        result = root * result + (int)price;
        return result;
    }
}
