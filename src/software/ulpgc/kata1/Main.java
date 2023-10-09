package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Daniel", LocalDate.of(2001, 05, 01));
        System.out.println(person.toString());
    }
}
