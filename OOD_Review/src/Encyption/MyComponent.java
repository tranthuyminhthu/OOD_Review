package Encyption;

public class MyComponent implements Component {

	private String data;
	private String result;

	public MyComponent(String data) {
		super();
		this.data = data;

	}

	@Override
	public void process() {
		// TODO Auto-generated method stub
		result = data.trim();

	}

	@Override
	public String getResult() {
		// TODO Auto-generated method stub

		return result;
	}

}
