package Payment;

public class XPay implements XPayment {
    private String customerName;
    private String creditCardNo;
    private int cardExpMonth;
    private int cardExpYear;
    private String cardCVVNo;
    private double amount;
    
    public XPay(String customerName, String creditCardNo, int cardExpMonth, int cardExpYear, String cardCVVNo) {
        this.customerName = customerName;
        this.creditCardNo = creditCardNo;
        this.cardExpMonth = cardExpMonth;
        this.cardExpYear = cardExpYear;
        this.cardCVVNo = cardCVVNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCreditCardNo() {
        return creditCardNo;
    }

    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    public int getCardExpMonth() {
        return cardExpMonth;
    }

    public void setCardExpMonth(int cardExpMonth) {
        this.cardExpMonth = cardExpMonth;
    }

    public int getCardExpYear() {
        return cardExpYear;
    }

    public void setCardExpYear(int cardExpYear) {
        this.cardExpYear = cardExpYear;
    }

    public String getCardCVVNo() {
        return cardCVVNo;
    }

    public void setCardCVVNo(String cardCVVNo) {
        this.cardCVVNo = cardCVVNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
        result = prime * result + ((creditCardNo == null) ? 0 : creditCardNo.hashCode());
        result = prime * result + cardExpMonth;
        result = prime * result + cardExpYear;
        result = prime * result + ((cardCVVNo == null) ? 0 : cardCVVNo.hashCode());
        long temp;
        temp = Double.doubleToLongBits(amount);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        XPay other = (XPay) obj;
        if (customerName == null) {
            if (other.customerName != null)
                return false;
        } else if (!customerName.equals(other.customerName))
            return false;
        if (creditCardNo == null) {
            if (other.creditCardNo != null)
                return false;
        } else if (!creditCardNo.equals(other.creditCardNo))
            return false;
        if (cardExpMonth != other.cardExpMonth)
            return false;
        if (cardExpYear != other.cardExpYear)
            return false;
        if (cardCVVNo == null) {
            if (other.cardCVVNo != null)
                return false;
        } else if (!cardCVVNo.equals(other.cardCVVNo))
            return false;
        if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
            return false;
        return true;
    }

    @Override
    public double payX(ShoppingCart shoppingCart) {
       setAmount(shoppingCart.getProducts().stream().reduce(new Product(0, "", 0), (product, newProduct) -> new Product(0, "", product.getPrice() + newProduct.getPrice())).getPrice());
       System.out.println(this.getAmount());
       return this.getAmount();
    }

    
}
