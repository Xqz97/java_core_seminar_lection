package seminar.seminar_3.task1;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AverageResponseDTO {
    private double averageSalary;
    private double averageAge;
    private int averageLettersInName;

}