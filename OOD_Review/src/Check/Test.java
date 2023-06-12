package Check;

public class Test {

	public static void main(String[] args) {

		Text_Component t = new Text_Component("0812281", new ValidationByNumberPhone());

		System.out.println(t.check());
	}
}
