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
        System.out.print("Хэшкод объекта -> ");
        return  result;
    }

    @Override
    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (getClass() != obj.getClass())
//            return false;
        Device other = (Device) obj;
        if (manufacturer != other.manufacturer)
            return false;
        if (price != other.price)
            return false;
        if (serialNumber != other.serialNumber)
            return false;
        return true;
    }
}
