package HW_07.additionalTask;

enum Vehicle {
    AUTO(5000, "Black"), MOTORCYCLE(2000, "Blue"), BIKE(300, "Yellow");
    private int cost;
    private String color;


        Vehicle(int cost, String color) {
            this.cost = cost;
            this.color = color;
        }

    public String getColor() {
        return color;
    }

    @Override
    public String toString(){
        return "This is " +super.toString() + " his cost - $" + cost +  " his color is " + color;
    }
}

