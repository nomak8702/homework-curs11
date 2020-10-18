package person;

import java.util.ArrayList;
import java.util.List;

public class Company {

    List<Person> personEmploy = new ArrayList<>();

    public List<Person> distinct() {
        List<Person> result = new ArrayList<>();
        for (Person person : personEmploy) {
            result.add(person);
        }
        return result;
    }

    public Person getManager() {
        for (Person person : personEmploy) {
            if (person.getPosition().equalsIgnoreCase("manager")) {
                return person;
            }
        }
        return null;
    }

    public List<Person> getPersons(String profession) {
        List<Person> result = new ArrayList<>();
        for (Person person : personEmploy) {
            if (person.getPosition().equalsIgnoreCase(profession)) {
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> getPersonOlder(int age) {
        List<Person> result = new ArrayList<>();
        for (Person person : personEmploy) {
            if (person.getAge() > age) {
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> getPerson(String name) {
        List<Person> result = new ArrayList<>();
        for (Person person : personEmploy) {
            if (person.getName().equalsIgnoreCase(name)) {
                result.add(person);
            }
        }
        return result;
    }

    public void employ(Person person) {
        personEmploy.add(person);

    }
}




