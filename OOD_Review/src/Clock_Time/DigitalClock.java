package Clock_Time;

public class DigitalClock implements Observer, DisplayTime {

	private int hour;
	private int minute;
	private int second;
	Subject clock;

	public DigitalClock(Subject clock) {
		super();
		this.clock = clock;
		clock.addObserver(this);
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

	public Subject getClock() {
		return clock;
	}

	public void setClock(Subject clock) {
		this.clock = clock;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Digital Clock: Hour: " + hour + " Minute: " + minute + " Second: " + second);

	}

	@Override
	public void update(int second, int minute, int hour) {
		// TODO Auto-generated method stub
		setHour(hour);
		setMinute(minute);
		setSecond(second);
		display();

	}

}
