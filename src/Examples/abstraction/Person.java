package Examples.abstraction;

public abstract class Person {
    public abstract String getDescription(); //абстрактный метод получения описания
    private String name;

    public Person (String name) { //конструктор класса. Обязательный
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
