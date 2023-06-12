package Product;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart {

	private Customer customer;
	private List<Product> listProdcut;
	private Strategy strategy;

	public ShoppingCart(Customer customer, List<Product> listProdcut, Strategy strategy) {
		super();
		this.customer = customer;
		this.listProdcut = listProdcut;
		this.strategy = strategy;
	}

	public void addProduct(Product p) {
		listProdcut.add(p);

	}

	public void removeProduct(Product p) {
		listProdcut.remove(p);

	}

	public double total() {

		double result = 0.0;
		Iterator<Product> iterator = listProdcut.iterator();
		while (iterator.hasNext()) {
			Product product = iterator.next();
			result += product.getPrice();

		}
		return result;

	}

	public double saleOnBirthday() {
		double rs = 0.0;
		if (total() == 2000) {
			return rs += total() * 0.1;
		} else if (total() == 5000) {
			return rs += total() * 0.15;
		} else if (total() > 10000) {
			return rs += total() * 0.2;

		}
		return rs;
	}

	public boolean checkBirthday() {

		if (customer.getDob().getDay() == LocalDateTime.now().getDayOfMonth() && customer.getDob().getMonth() == LocalDateTime.now().getMonthValue()) {
			return true;
		} else {
			return false;
		}

	}

	public double discountForBirthday() {
		double total = total();
		if (checkBirthday()) {
			total = total() - saleOnBirthday();
		}
		return total;
	}

	@Override
	public String toString() {
		return "ShoppingCart [customer=" + customer + ", listProdcut=" + listProdcut + ", strategy=" + strategy + "]";
	}
}
