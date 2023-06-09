package Clock;

public class Test {
	public static void main(String[] args) {
		Clock clock = new Clock();
		AnalogClock ana = new AnalogClock(clock);
		DigitalClock di = new DigitalClock(clock);
		clock.setMeasurementsChanged(3, 4, 5);
		ana.print();
		di.print();

	}

}
