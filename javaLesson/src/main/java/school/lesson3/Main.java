package school.lesson3;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com",
                                    "67829384", 30000, 41);
        employees[1] = new Employee("Petr Petrovich", "QA Engineer", "petrovich@mailbox.com",
                                    "18762934", 20500, 40);
        employees[2] = new Employee("Tatsiana Dmitrievna", "Data analyst", "tatiana@mailbox.com",
                                    "67871238", 100000, 23);
        employees[3] = new Employee("Sergey Aleksandrovich", "PM", "sergeypm@mailbox.com",
                                    "709997378", 40900, 48);
        employees[4] = new Employee("Maksim Kirillovich", "BA", "maksimba@mailbox.com",
                                    "709997378", 40900, 19);

        for (Employee employee:
                employees) {
            if(employee.getAge()>40) {
                employee.printEmployeeInfo();
            }
        }
    }
}
