package Encyption;

public abstract class Decorator implements Component {

	Component component;

	public Decorator(Component component) {
		super();
		this.component = component;
	}

}
