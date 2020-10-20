package HW_09.additionaTask;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal();
        Animal cat = new Animal();
        Animal earthWorm = new Animal();

        dog.name = "Cherry";
        dog.age = 3;
        dog.tail = true;

        cat.name = "Helga";
        cat.age = 3;
        cat.tail = true;

        earthWorm.name = "Jim";
        earthWorm.age = 7;
        earthWorm.tail = false;


        System.out.println(dog.hashCode());
        System.out.println(cat.hashCode());
        System.out.println(earthWorm.hashCode());

        System.out.println(dog.equals(cat));
        System.out.println(cat.equals(earthWorm));
    }
}
