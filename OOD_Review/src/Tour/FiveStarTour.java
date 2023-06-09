package Tour;

public class FiveStarTour extends DecorTour {

	public FiveStarTour(Tour tour) {
		super(tour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double priceOfTour() {
		// TODO Auto-generated method stub
		return getTour().priceOfTour() * 1.5;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return getTour().getDescription() + " is five tour";
	}

}
