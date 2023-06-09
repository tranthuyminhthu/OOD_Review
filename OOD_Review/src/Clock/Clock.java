package Clock;

import java.util.Observable;

public class Clock extends Observable {

	private int hour;
	private int minute;
	private int second;

	public Clock() {
		
	}
	public Clock(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public void tick() {

		second++;
		if ((second %= 60) == 0)
			minute++;
		if ((minute %= 60) == 0)
			hour++;
		hour %= 24;
	}

	public void measurementsChanged() {
		setChanged();
		notifyObservers();

	}

	public void setMeasurementsChanged(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		measurementsChanged();
	}
}
