package Clock_Time;

public interface Subject {

	public void removeObserver(Observer observer);

	public void addObserver(Observer observer);

	public void notifyObserver();

}
