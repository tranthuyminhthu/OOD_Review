package ShapeFactory;

public class Rectangle implements IShape {

	private double width;
	private double height;

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(" ve hinh chu nhat voi kic thuoc "+ this.height +" x " + this.width);

	}

}
