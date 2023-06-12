package lab1;

public class Decaf extends Beverage {

	public Decaf(String description, boolean milk, boolean soy, boolean mocha, boolean whip) {
		super(description, milk, soy, mocha, whip);
		// TODO Auto-generated constructor stub
	}

	public double cost() {

		return super.cost() + 1.05;
	}

}
