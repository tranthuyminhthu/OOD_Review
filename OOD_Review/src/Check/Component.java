package Check;

public abstract class Component {

	private String data;

	private ValidationBehavior validationBehavior;

	public Component(String data, ValidationBehavior validationBehavior) {
		super();
		this.data = data;
		this.validationBehavior = validationBehavior;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public boolean check() {
		return validationBehavior.validation(data);

	}
}
