package seminar.seminar_4.task2;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Product {
    private String productName;

    private BigDecimal price;

    public Product(String productName, BigDecimal price) {
        this.productName = productName;
        this.price = price;
    }
}
