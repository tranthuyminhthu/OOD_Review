package Product;

public class PayPal implements Strategy{
	
	private String email;
	
	private String password;


	public PayPal(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	@Override
	public double payment(double priceOfBill) {
		// TODO Auto-generated method stub
		return priceOfBill + priceOfBill *0.9;
	}

	@Override
	public String toString() {
		return "PayPal [email=" + email + ", password=" + password + "]";
	}

}
