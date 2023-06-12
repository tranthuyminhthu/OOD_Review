package Clock_Time;

public class AnaClock implements Observer, DisplayTime {

	private int sencond;
	private int minute;
	private int hour;
	private Subject clock;

	public AnaClock(Subject clock) {
		super();
		this.clock = clock;
		clock.addObserver(this);
	}

	public int getSencond() {
		return sencond;
	}

	public void setSencond(int sencond) {
		this.sencond = sencond;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public Subject getClock() {
		return clock;
	}

	public void setClock(Subject clock) {
		this.clock = clock;
	}

	@Override
	public void update(int second, int minute, int hour) {
		// TODO Auto-generated method stub
		setSencond(second);
		setMinute(minute);
		setHour(hour);
		display();

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("AnaClock: Hour: " + hour + " Minute: " + minute + "Second: " + sencond);

	}

}
