package HW_09.task2;

public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public Monitor() {

    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "manufacturer=" + getManufacturer() + ", price=" + getPrice() + ", serialNumber=" + getSerialNumber() + ", X=" + resolutionX + ",Y=" +resolutionY;
    }

    @Override
    public int hashCode() {
        final int root = 13;
        int result = 1;
        result = root * result + (resolutionX - resolutionY);
        System.out.print("Хэшкод объекта -> ");
        return result;
    }
}
