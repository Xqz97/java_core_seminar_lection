package seminar.seminar_4.task1;

import seminar.seminar_4.task1.exception.WrongLoginException;
import seminar.seminar_4.task1.exception.WrongPasswordException;

import java.util.Objects;

public class Employee {
    private String login;
    private String password;
    private String confirmPassword;

    public Employee(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() < 20) {
            this.login = login;
        } else {
            throw new WrongLoginException("Введен неверный логин, длина должна быть менее 20 символов!");
        }
        if (password.length() < 20){
            this.password = password;
        } else {
            throw new WrongPasswordException("Введен неверный пароль, длина должна быть менее 20 символов!");
        }
        if (password.equals(confirmPassword)){
            this.confirmPassword = confirmPassword;
        } else {
            throw new WrongPasswordException("Проверка не пройдена");
        }



    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(login, employee.login) && Objects.equals(password, employee.password) && Objects.equals(confirmPassword, employee.confirmPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, confirmPassword);
    }
}
