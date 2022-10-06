package school.lesson8.task2;

import java.util.*;

public class PhoneHandBook {

    private final Map<String, Set<String>> personPhoneMap = new TreeMap<>();

    public void addRecord(Person person, String phoneNumber) {
        if (personPhoneMap.containsKey(person.getSurname())) {
            personPhoneMap.get(person.getSurname()).add(phoneNumber);
        } else {
            personPhoneMap.put(person.getSurname(), new HashSet<>());
            personPhoneMap.get(person.getSurname()).add(phoneNumber);
        }
    }

    public String getPhone(String surname) {
        if (personPhoneMap.containsKey(surname)) {
            return surname + " " + personPhoneMap.get(surname);
        } else return "Человека с фамилией " + surname + " нет в справочнике";
    }

    public String getPhone(Person person) {
        if (personPhoneMap.containsKey(person.getSurname())) {
            return person.getSurname() + " : " + personPhoneMap.get(person.getSurname());
        } else return "Человека с фамилией " + person.getSurname() + " нет в справочнике";
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        personPhoneMap.forEach((s, strings) -> stringBuilder.append(s).append(" : ").append(strings.toString()).append("\n"));
        return stringBuilder.toString();
    }

}
