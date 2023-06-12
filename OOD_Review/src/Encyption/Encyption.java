package Encyption;

public class Encyption extends Decorator {

	private String result;

	public Encyption(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void process() {
		// TODO Auto-generated method stub
		char[] x = component.getResult().toCharArray();
		char[] rs = new char[x.length];
		for (int i = 0; i < rs.length; i++) {
			rs[i] = (char) (x[i] + 1);
		}

		result = new String(rs);
	}

	@Override
	public String getResult() {
		// TODO Auto-generated method stub
		return result;
	}

}
