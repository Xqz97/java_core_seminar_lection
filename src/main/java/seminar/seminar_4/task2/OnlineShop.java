package seminar.seminar_4.task2;

import lombok.Data;
import seminar.seminar_4.task2.my_exception.BuyerNotExistException;
import seminar.seminar_4.task2.my_exception.IncorrectQuantityException;
import seminar.seminar_4.task2.my_exception.ProductNotExistException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class OnlineShop {
    private static List<Buyer> buyerList = new ArrayList<>();
    private static List<Product> productList =  new ArrayList<>();
    private static List<Order> orderList = new ArrayList<>();

    public static Order buyProduct(String buyerName, String productName, int quantityOfProduct) throws IncorrectQuantityException, BuyerNotExistException, ProductNotExistException {
        Buyer currentBuyer = null;
        for (Buyer i: buyerList) {
            if ((i.getName().equals(buyerName))){
                currentBuyer = i;
                break;
            }
        }
        Product currentProduct = null;
        for (Product i : productList) {
            if (i.getProductName().equals(productName)){
                currentProduct = i;
                break;
            }
        }
        if (quantityOfProduct <= 0){
            throw new IncorrectQuantityException("product quantity can't be negative");
        }
        if (currentBuyer == null){
            throw new BuyerNotExistException();
        }
        if (currentProduct == null){
            throw new ProductNotExistException();
        }

        return new Order(currentBuyer, currentProduct, quantityOfProduct);
    }


    public static List<Buyer> getBuyerList() {
        return buyerList;
    }

    public static List<Product> getProductList() {
        return productList;
    }

    public static List<Order> getOrderList() {
        return orderList;
    }
}
