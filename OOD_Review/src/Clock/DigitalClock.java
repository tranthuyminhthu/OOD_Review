package Clock;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {

	private int hour;
	private int second;
	private int minute;
	Observable obs;

	public DigitalClock(Observable obs) {
		super();
		this.obs = obs;
		obs.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		Clock clockTime = (Clock) obs;
		this.hour = clockTime.getHour();
		this.minute = clockTime.getMinute();
		this.second = clockTime.getSecond();

	}

	public void print() {
		System.out.println(
				" DigitalClock " + " hour: " + this.hour + "second: " + this.second + " minute: " + this.minute);
		;

	}

}
