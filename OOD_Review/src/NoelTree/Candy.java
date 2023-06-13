package NoelTree;

public class Candy extends Ornament {

	public Candy(Decorator decorator) {
		super(decorator);
		// TODO Auto-generated constructor stub
		id = 1;
		name = "candy";
		price = 2;
		description = "Candy";

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
