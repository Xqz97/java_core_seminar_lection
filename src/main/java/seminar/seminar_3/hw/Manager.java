package seminar.seminar_3.hw;

import seminar.seminar_3.task1.Employee;

import java.time.LocalDate;
import java.util.List;

public class Manager extends Employee {
    public Manager(String position, String name, String lastName, String secondName, int salary, long phoneNumber, int age, LocalDate birthday) {
        super(position, name, lastName, secondName, salary, phoneNumber, age, birthday);
    }

        public static void riseOfSalaryAllWithoutManager(List<Employee> employees, int allowance){
        for (Employee i : employees) {
            if (!(i instanceof Manager)){
                i.increaseSalary(allowance);
            }
        }
    }
}
