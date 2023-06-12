package lab1;

public abstract class Beverage {
	private String description;
	private boolean milk;
	private boolean soy;
	private boolean mocha;
	private boolean whip;
	public Beverage(String description, boolean milk, boolean soy, boolean mocha, boolean whip) {
		super();
		this.description = description;
		this.milk = milk;
		this.soy = soy;
		this.mocha = mocha;
		this.whip = whip;
	}

	
	public  double cost() {
		double sum = 0;
		if (milk) sum += 0.1;
		if (soy) sum += 0.15;
		if (mocha) sum += 0.2;
		if (whip) sum += 0.1;
		return sum;
	};
	
}
