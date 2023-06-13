package NoelTree;

public class Tree extends Ornament implements Decorator {

	public Tree() {
		super();
		id = 1;
		name = "tree";
		price = 1;
		description = "Base Tree";
		// TODO Auto-generated constructor stub
	}

	@Override
	public String show() {
		// TODO Auto-generated method stub
		return this.description;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return getPrice();
	}
}