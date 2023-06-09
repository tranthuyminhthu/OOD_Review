package Tour;

public abstract class Tour {

	private String name;
	private String description;
	private int days;
	private double baseTour;

	public Tour() {

	}

	public Tour(String name, String description, int days, double baseTour) {
		super();
		this.name = name;
		this.description = description;
		this.days = days;
		this.baseTour = baseTour;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getBaseTour() {
		return baseTour;
	}

	public void setBaseTour(double baseTour) {
		this.baseTour = baseTour;
	}

	abstract double priceOfTour();

}
