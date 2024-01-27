package seminar.seminar_3.task1;

import lombok.*;
import java.time.LocalDate;
import java.util.Comparator;

//@Getter
//@Setter
// @AllArgsConstructor
//@EqualsAndHashCode
//@ToString
@Data
public class Employee {
        private String position;
        private String name;
        private String lastName;
        private String secondName;
        private int salary;
        private long phoneNumber;
        private int age;
        private LocalDate birthday;

    public LocalDate getBirthday() {
        return birthday;
    }

    public Employee(String position, String name, String lastName, String secondName, int salary, long phoneNumber, int age, LocalDate birthday) {
        this.position = position;
        this.name = name;
        this.lastName = lastName;
        this.secondName = secondName;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.birthday = birthday;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void info(){
        System.out.println("Имя: " + name + " " +
                "Зарплата: " + salary + " " +
                "Должность: " + position + " " +
                "Возраст: " + getAge());
    }

    public String myToString(){
        return String.format("%s - %s, %d", name, position, salary);
    }

    public void printInfoAboutObject(){
        System.out.println(this);
    }

    public void increaseSalary(int allowance){
        this.salary += allowance;
    }

//    public static void main(String[] args) {
//        Employee employee1 = new Employee("Директор", "Роман", "Турусов", "Andreevich", 450000, 898131231, 26);
//        employee1.info();
//        System.out.println(employee1.toString());
//        System.out.println(employee1.myToString());
//        System.out.println(employee1);
//    }

    public static Comparator<Employee> sortByBirthDate() {
        return Comparator.comparing(Employee::getBirthday);
    }
}
