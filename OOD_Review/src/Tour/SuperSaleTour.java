package Tour;

public class SuperSaleTour extends DecorTour {

	private double saleRate;

	public SuperSaleTour(Tour tour, double saleRate) {
		super(tour);
		this.saleRate = saleRate;
	}

	public double getSaleRate() {
		return saleRate;
	}

	public void setSaleRate(double saleRate) {
		this.saleRate = saleRate;
	}

	@Override
	public double priceOfTour() {
		// TODO Auto-generated method stub
		return (getTour().priceOfTour()) * (1 - this.saleRate);
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return getTour().getDescription() + " has been discounted" + this.saleRate;
	}

}
