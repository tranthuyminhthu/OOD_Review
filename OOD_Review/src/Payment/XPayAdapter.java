package Payment;

public class XPayAdapter implements DPayment {
    XPayment xpay;
    
    public XPayAdapter(XPayment xpay) {
        this.xpay = xpay;
    }

    @Override
    public double payD(ShoppingCart cart) {
       return xpay.payX(cart);
    }
    
}
