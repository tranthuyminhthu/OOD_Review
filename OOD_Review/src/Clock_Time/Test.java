package Clock_Time;

public class Test {
	public static void main(String[] args) {
		Clock c = new Clock();
		AnaClock ana = new AnaClock(c);
		c.setTime();
		ana.display();
	}

}
