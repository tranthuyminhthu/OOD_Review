package Tour;

public class DomesticTour extends Tour {

	public DomesticTour(String name, String description, int days, double baseTour) {
		super(name, description, days, baseTour);
		// TODO Auto-generated constructor stub
	}

	@Override
	double priceOfTour() {
		// TODO Auto-generated method stub
		return getBaseTour();
	}

}
