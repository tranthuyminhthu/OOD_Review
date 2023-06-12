package Product;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Date d = new Date(12, 6, 2004);

		Customer cus = new Customer(1, "Mthu", d, "00329842", "tphcm");
		Product p1 = new Product(1, "sua tam", 9000);
		Product p2 = new Product(2, "sua tam ne", 1000);
		Product p3 = new Product(3, "sua tam do", 9060);
		Product p4 = new Product(4, "sua tam ok", 9000);

		List<Product> list = new ArrayList<Product>();

		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);

		Strategy stra = new PayPal("thu", "abc");
		ShoppingCart s = new ShoppingCart(cus, list, stra);
		System.out.println(s.total());
		System.out.println(s.discountForBirthday());
		System.out.println(s.toString());
		System.out.println(s.saleOnBirthday());

	}

}
