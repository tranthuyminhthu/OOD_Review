package NoelTree;

public class Bubble extends Ornament {

	public Bubble(Decorator decorator) {
		super(decorator);
		id = 2;
		name = "bubble";
		price = 3;
		description = "Bubble";
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
