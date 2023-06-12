package ShapeFactory;

public class Square implements IShape {

	private double width;
	
	

	public Square(double width) {
		super();
		this.width = width;
	}



	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("ve hinh vuong voi kich thuoc: "+ this.width);

	}

}
