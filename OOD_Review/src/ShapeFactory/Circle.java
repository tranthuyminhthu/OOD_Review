package ShapeFactory;

public class Circle implements IShape {

	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("ve hinh tron voi kich thuoc:" + this.radius);

	}

}
