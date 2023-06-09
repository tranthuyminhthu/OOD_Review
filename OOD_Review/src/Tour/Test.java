package Tour;

public class Test {
	
	public static void main(String[] args) {
		
		DomesticTour d = new DomesticTour("nha trang", " 2 ngay 3 dem", 3, 900000);
		OverSeasTour o = new OverSeasTour("Bangkok", " 2 ngay 3 dem", 3, 900000, " Thai Lan", 300);
		
		SuperSaleTour s = new SuperSaleTour(o, 0.2);
		System.out.println(s.priceOfTour());
		System.out.println(s.getDescription());
		
		FiveStarTour f = new FiveStarTour(d);
		System.out.println(f.priceOfTour());
		System.out.println(f.getDescription());
	}

}
