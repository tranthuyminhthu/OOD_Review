package lab1;

public class HouseBlend extends Beverage {

	public HouseBlend(String description, boolean milk, boolean soy, boolean mocha, boolean whip) {
		super(description, milk, soy, mocha, whip);
		// TODO Auto-generated constructor stub
	}

	public double cost() {

		return super.cost() + 0.89;
	}
}
