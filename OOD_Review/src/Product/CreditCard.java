package Product;

public class CreditCard implements Strategy {

	private String cardName;
	private String cardNumber;

	public CreditCard(String cardName, String cardNumber) {
		super();
		this.cardName = cardName;
		this.cardNumber = cardNumber;
	}

	@Override
	public double payment(double priceOfBill) {
		// TODO Auto-generated method stub
		return priceOfBill + 50000;
	}

	@Override
	public String toString() {
		return "CreditCard [cardName=" + cardName + ", cardNumber=" + cardNumber + "]";
	}

}
