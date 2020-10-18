package person;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Andrei Paul", 52, "manager"));
        person.add(new Person("Cojocaru Costel", 46, "welders"));
        person.add(new Person("Balazs Ionel", 26, "welders"));
        person.add(new Person("Laci Vasile", 19, "carpenters"));
        person.add(new Person("Stefan George", 25, "carpenters"));
        person.add(new Person("Bela Lajos", 50, "plummers"));
        person.add(new Person("Dumitru Sorin", 48, "plummers"));

        Company company = new Company();
        company.employ(person.get(0));
        company.employ(person.get(1));
        company.employ(person.get(2));
        company.employ(person.get(3));
        company.employ(person.get(4));
        company.employ(person.get(5));
        company.employ(person.get(6));
        System.out.println(company.getManager());
        System.out.println(company.getPersons("welders"));
        System.out.println(company.getPersonOlder(50));
        System.out.println(company.getPerson("Bela Lajos"));


    }
}
