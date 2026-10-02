package person;

import java.util.*;

public class PersonRepository {
    private final Map<Integer, Person> persons = new HashMap<>();

    public void save(Person person) {
        persons.put(person.id(), person);
    }

    public int countPersonByGender(Gender gender) {
        int count = 0;
        for (Person person: persons.values()) {
            if(person.gender() == gender) {
                count++;
            }
        }
        return count;
    }

    public List<Person> findPersonByFavoriteDay(DaysOfWeek favoriteDay) {
        List<Person> list = new ArrayList<>();
        for (Person person: persons.values()) {
            if(person.favoriteDay() == favoriteDay) {
                list.add(person);
            }
        }
        return list;
    }

    public Optional<Person> findPersonById(int id) {
        return Optional.ofNullable(persons.get(id));
    }

    public Optional<Person> findPersonByName(String name) {
        return persons.values().stream()
                .filter(person -> person.name().equals(name))
                .findFirst();
    }
}