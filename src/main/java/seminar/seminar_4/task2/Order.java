package seminar.seminar_4.task2;

import lombok.Data;

@Data
public class Order {
    private Buyer buyer;
    private Product product;
    private int quantity;

    public Order(Buyer buyer, Product product, int quantity) {
        this.buyer = buyer;
        this.product = product;
        this.quantity = quantity;
    }
}
