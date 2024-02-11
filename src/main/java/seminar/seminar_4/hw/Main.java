package seminar.seminar_4.hw;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees1 = new ArrayList<>(3);
        employees1.add(new Employee("Roman", "123", Gender.MALE));
        employees1.add(new Employee("Anna", "Sarko", Gender.FEMALE));
        employees1.add(new Employee("sadsad", "adsad", Gender.OTHER));

        holidayGreetings(employees1);
    }

    public static void holidayGreetings(List<Employee> employees){
        for (Employee i :employees) {
            if(i.getGender() == Gender.FEMALE) {
                System.out.println("С 8 марта: "+ i.getName() + " " + i.getLastName());
            }
            if (i.getGender() == Gender.MALE){
                System.out.println("С 23 февраля: " + i.getName() + " " + i.getLastName());
            }
            System.out.println("C новым годом: "  + i.getName() + " " + i.getLastName());

        }
    }
}
