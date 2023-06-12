package Clock_Time;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Clock implements Subject {

	private int second;
	private int minute;
	private int hour;

	List<Observer> obs;

	public Clock() {
		obs = new ArrayList<Observer>();
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
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

	public List<Observer> getObs() {
		return obs;
	}

	public void setObs(List<Observer> obs) {
		this.obs = obs;
	}

	public void setTime(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
		notifyObserver();
	}

	public void setTime() {
		Timer tim = new Timer();
		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				setTime(Calendar.getInstance().getTime().getHours(), Calendar.getInstance().getTime().getMinutes(),
						Calendar.getInstance().getTime().getSeconds());
				System.out.println("=============");

			}

		};
		tim.scheduleAtFixedRate(task, 0, 1000);
	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		obs.remove(observer);

	}

	@Override
	public void addObserver(Observer observer) {
		// TODO Auto-generated method stub
		obs.add(observer);

	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		obs.stream().forEach((obs) -> obs.update(second, minute, hour));

	}

}
