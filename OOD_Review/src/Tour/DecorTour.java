package Tour;

public abstract class DecorTour extends Tour {

	private Tour tour;

	public DecorTour(Tour tour) {
		super();
		this.tour = tour;
	}

	public Tour getTour() {
		return tour;
	}

	@Override
	public abstract double priceOfTour();

	@Override
	public abstract String getDescription();

}
