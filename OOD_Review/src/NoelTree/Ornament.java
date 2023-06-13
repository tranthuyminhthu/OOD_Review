package NoelTree;

public abstract class Ornament implements Decorator {

	protected int id;
	protected String name;
	protected double price;
	protected String description;
	Decorator decorator;

	public Ornament() {
		
	}
	public Ornament(Decorator decorator) {
		super();
		this.decorator = decorator;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
