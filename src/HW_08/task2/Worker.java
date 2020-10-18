package HW_08.task2;

import java.time.LocalDate;

public class Worker implements Comparable {
    public String surname;
    public String position;
    public LocalDate hireDate;

    public Worker(String surname, String position, LocalDate hireDate) {
        this.surname = surname;
        this.position = position;
        this.hireDate = hireDate;
    }
    @Override
    public int compareTo(Object o) {
        return this.surname.compareTo(((Worker) o).surname);

    }
    @Override
    public String toString() {return this.surname + " " + this.position + " " + this.hireDate;}


}




