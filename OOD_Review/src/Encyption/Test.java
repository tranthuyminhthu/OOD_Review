package Encyption;

public class Test {

	public static void main(String[] args) {

		MyComponent m = new MyComponent("abc");
		m.process();
		System.out.println(m.getResult());
		Encyption e = new Encyption(m);
		e.process();
		System.out.println(e.getResult());
	}

}
