package seminar.seminar_4.task2;

import lombok.Data;

@Data
public class Buyer {
    private String name;
    private Gender gender;

    public Buyer(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    // Геттеры и сеттеры для поля "пол"
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


}