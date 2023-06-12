package ShapeFactory;

import java.util.Random;

public class ShapeFactory {
	Random rd = new Random();

	public IShape creatShape() {
		int random = rd.nextInt(100);

		if (random < 30) {
			return new Square(rd.nextDouble(10));

		} else if (random >= 30 && random < 60) {
			return new Rectangle(rd.nextDouble(10), rd.nextDouble(10));
		} else {
			return new Circle(rd.nextDouble(10));
		}

	}

}
