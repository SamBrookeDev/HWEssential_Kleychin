package HW_01.Task2;

public class Rectangle {
    static private double side1, side2;// Длина и ширина соответсвенно

    //Конструктор класса будет создан автоматически
    //значит нам требуется создать setters & getters

    public void setSide1 (double side1){
        this.side1 = side1;
    }

    public double getSide1 (){
        return side1;
    }

    public void setSide2 (double side2){
        this.side2 = side2;
    }

    public double getSide2 (){
        return side2;
    }

    double AreaCalculator (){
       double result;
       result = side1 * side2;
       return result;
    }

    double PerimeterCalculator (){
        double result;
        result = 2 * (side1 + side2);
        return result;
    }

}
