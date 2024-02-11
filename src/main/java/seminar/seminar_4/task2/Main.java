package seminar.seminar_4.task2;

import seminar.seminar_4.task2.my_exception.BuyerNotExistException;
import seminar.seminar_4.task2.my_exception.IncorrectQuantityException;
import seminar.seminar_4.task2.my_exception.ProductNotExistException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        OnlineShop.getBuyerList().add(new Buyer("Roman", Gender.MALE));
        OnlineShop.getBuyerList().add(new Buyer("Andrey", Gender.MALE));
        OnlineShop.getProductList().add(new Product("apple", BigDecimal.valueOf(150)));
        OnlineShop.getProductList().add(new Product("orange", BigDecimal.valueOf(300)));
        try {
            Order order = OnlineShop.buyProduct("Roman", "apple", 20);
            OnlineShop.getOrderList().add(order);
            System.out.println(OnlineShop.getOrderList());
            Order order2 = OnlineShop.buyProduct("Roman", "apple", 20);
            OnlineShop.getOrderList().add(order2);
            System.out.println(OnlineShop.getOrderList());
            Order order3 = OnlineShop.buyProduct("", "", -1);
            OnlineShop.getOrderList().add(order3);
            System.out.println(OnlineShop.getOrderList());
        } catch (IncorrectQuantityException | ProductNotExistException| BuyerNotExistException e) {
            System.out.println(e.getMessage());;
        }

        System.out.println("Order received: " + OnlineShop.getOrderList().size());
    }
}
