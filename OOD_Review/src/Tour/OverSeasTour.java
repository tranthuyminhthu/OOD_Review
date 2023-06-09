package Tour;

public class OverSeasTour extends Tour {

	private String country;
	private double visaSurtax;

	public OverSeasTour(String name, String description, int days, double baseTour, String country, double visaSurtax) {
		super(name, description, days, baseTour);
		this.country = country;
		this.visaSurtax = visaSurtax;
	}

	@Override
	double priceOfTour() {
		// TODO Auto-generated method stub
		return getBaseTour() + visaSurtax ;
	}

}
