package HW_09.additionaTask;

import HW_09.task2.Device;

public class Animal {
    public String name;
    public int age;
    public boolean tail;

    public Animal() {

    }

    @Override
    public int hashCode() {
        final int root = 13;
        int result = 1;
        int condition = 0;
        if (tail == true) {
            condition = 2;
        } else {
            condition = 3;
        }
        result = root * result + age + condition;
        System.out.print("Хэшкод объекта -> ");
        return result;
    }

    @Override
    public boolean equals(Object obj) {
//
        Animal other = (Animal) obj;
        if (age != other.age)
            return false;
        if (tail != other.tail)
            return false;
        return true;
    }

}
