package lab2;

public class Whip extends CondimentDecorator{

	public Whip(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return 0.1 + beverage.cost();
	}

}
