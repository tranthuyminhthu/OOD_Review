package Payment;

import java.util.ArrayList;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Customer john = new Customer(1, "John", new Date(2009,10,9), "0111", "john@gmail.com", "abc");
        Product shoes = new Product(1, "Shoes", 12.5);
        ArrayList<Product> products = new ArrayList<>();
        products.add(shoes);
        ShoppingCart cart = new ShoppingCart(john, products);

        XPayment xpay = new XPay("john", "098", 13, 2001, "078");
        XPayAdapter dpay = new XPayAdapter(xpay);
        
        dpay.payD(cart);
    }
}
