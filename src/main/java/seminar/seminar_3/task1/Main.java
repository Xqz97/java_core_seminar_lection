package seminar.seminar_3.task1;

import seminar.seminar_3.hw.Manager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static seminar.seminar_3.task1.Employee.sortByBirthDate;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[6];
        Employee employee1 = new Employee("1", "Roman", "t", "fdsf", 4300, 123213, 23, LocalDate.of(1990, 5, 15));
        Employee employee2 = new Employee("1", "Roman", "t", "fdsf", 1800, 123213, 45, LocalDate.of(1985, 10, 22));
        Employee employee3 = new Employee("1", "Roman", "t", "fdsf", 1300, 123213, 75, LocalDate.of(1975, 10, 19));
        Employee employee4 = new Employee("1", "Roman", "t", "fdsf", 1000, 123213, 60, LocalDate.of(1955, 10, 13));
        Employee employee5 = new Employee("1", "Roman", "t", "fdsf", 5000, 123213, 22, LocalDate.of(1985, 10, 7));
        Manager manager1 = new Manager("0", "Andrey", "Prohorov", "Yrtre", 45000, 2434234, 34, LocalDate.of(1935, 10, 7 ));
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;
        employees[5] = manager1;

        List<Employee> employees1 = new ArrayList<>(Arrays.asList(employee1, employee2, employee3, employee4, employee5, manager1));

        // riseOfSalary1(employees);
        // riseOfSalary2(employees, 45, 10000);
        // riseOfSalary3(employees1, 45, 100000);
        // printArray(employees);

        // avgOfAgeAndSalary(employees1);

//        Comparator<Employee> comparator = sortByBirthDate();
//        int result = comparator.compare(employee1, employee2);
//
//        if (result < 0) {
//            System.out.println("Сотрудник 1 родился раньше сотрудника 2");
//        } else if (result > 0) {
//            System.out.println("Сотрудник 1 родился позже сотрудника 2");
//        } else {
//            System.out.println("Сотрудники родились в один день");
//
//        }
        manager1.riseOfSalaryAllWithoutManager(employees1, 15000);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void riseOfSalary1(Employee[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i].getAge() > 45){
                array[i].setSalary(array[i].getSalary() + 5000);
            }
        }
    }
    public static void riseOfSalary2(Employee[] array, int age, int allowance){
        for (int i = 0; i < array.length; i++) {
            if (array[i].getAge() > age){
                array[i].setSalary(array[i].getSalary() + allowance);
            }
        }
    }



    public static void printArray(List<Employee> array){
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }

    public static void avgOfAgeAndSalary(List<Employee> employees){
        int sumAge = 0;
        int sumSalary = 0;
        for (Employee i: employees) {
            sumAge += i.getAge();
            sumSalary += i.getSalary();
        }
        System.out.println("Средний возраст: " + sumAge / employees.size() + "\n" + "Средняя зарплата: " + sumSalary / employees.size());
    }

    public static String getAverageSalaryAndAge(List<Employee> employees) {
        double averageSalaries = employees.stream().mapToDouble(x -> x.getSalary()).average().orElseThrow();
        double averageAge = employees.stream().mapToDouble(x -> (double) x.getAge()).average().orElseThrow();

        return String.format("Average salary - %s, age - %s", averageSalaries, averageAge);

    }

    public static AverageResponseDTO getAverage(List<Employee> employees) {
        return AverageResponseDTO.builder()
                .averageAge(employees.stream().mapToDouble(x -> (double) x.getAge()).average().orElseThrow())
                .averageSalary(employees.stream().mapToDouble(x -> x.getSalary()).average().orElseThrow())
                .averageLettersInName((int) employees.stream().mapToInt(x -> x.getName().length()).average().orElseThrow())
                .build();
    }


}

