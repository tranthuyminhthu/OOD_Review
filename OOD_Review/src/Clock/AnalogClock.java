package Clock;

import java.util.Observable;
import java.util.Observer;

public class AnalogClock implements Observer {

	private int hour;
	private int minute;
	private int second;
	Observable obs;

	public AnalogClock(Observable obs) {
		super();
		this.obs = obs;
		obs.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		Clock clock = (Clock) obs;
		this.hour = clock.getHour();
		this.second = clock.getSecond();
		this.minute = clock.getMinute();

	}

	public void print() {
		System.out.println(" AnaClock " + "hour: " + this.hour + " minute: " + this.minute + " second: " + this.second);
		
	}

}
