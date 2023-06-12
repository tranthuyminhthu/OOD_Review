package Payment;

public class DPay implements DPayment {

    @Override
    public double payD(ShoppingCart cart) {
      return cart.getProducts().stream().reduce(new Product(0, null, 0), (products, newProduct) ->  new Product(0, null, products.getPrice() + newProduct.getPrice())).getPrice();
    }
    
}
