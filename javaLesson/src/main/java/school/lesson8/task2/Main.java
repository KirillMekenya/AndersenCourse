package school.lesson8.task2;

public class Main {
    public static void main(String[] args) {
        PhoneHandBook phoneHandBook = new PhoneHandBook();
        Person person = new Person("Grigoriev");

        phoneHandBook.addRecord(new Person("Avdeev"), "+375292826381");
        phoneHandBook.addRecord(new Person("Petrov"), "+37522346381");
        phoneHandBook.addRecord(new Person("Petrov"), "+4822346381");
        phoneHandBook.addRecord(new Person("Nikolaev"), "+31232134234");
        phoneHandBook.addRecord(new Person("Kozlov"), "+71298372134");
        phoneHandBook.addRecord(new Person("Kozlov"), "+31232134234");
        phoneHandBook.addRecord(new Person("Kozlov"), "+18232137395");
        phoneHandBook.addRecord(new Person("Baskov"), "+7234537378");

        //Человек с уже существующей фамилией и номером телефона в справочнике
        //не добавится
        phoneHandBook.addRecord(new Person("Kozlov"), "+31232134234");

        System.out.println(phoneHandBook.getPhone("Kozlov"));
        System.out.println(phoneHandBook.getPhone(person));
        System.out.println();
        System.out.println("Весь справочник");
        System.out.println(phoneHandBook);
    }
}
