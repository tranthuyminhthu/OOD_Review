package NoelTree;

public class Garland extends Ornament {

	public Garland(Decorator decorator) {
		super(decorator);

		id = 3;
		name = "garland";
		description = "Garland";
		price = 5;

		// TODO Auto-generated constructor stub
	}

	@Override
	public String show() {
		// TODO Auto-generated method stub
		return decorator.show() + "+" + this.description;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return decorator.cost() + this.price;
	}

}
