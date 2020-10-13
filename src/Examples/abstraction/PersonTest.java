package Examples.abstraction;

public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Employee("Semen Kleychin", 55000, 2020, 01, 31);
        people[1] = new Student("Helga Potaki", "physics");
        for (Person a : people
        ) {
            System.out.println(a.getName() + ", " + a.getDescription());
        }
    }
}
