package ShapeFactory;

public class Test {

	public static void main(String[] args) {

		ShapeFactory s = new ShapeFactory();
		IShape i = s.creatShape();
		i.draw();

	}
}
