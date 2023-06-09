package Check_Text;

public class TextComponent {
	private String content;
	private Strategy strategy;

	public TextComponent(String content, Strategy strategy) {
		super();
		this.content = content;
		this.strategy = strategy;
	}

	public boolean validation() {
		this.content = content.trim();
		if (strategy.validation(content) == true) {
			return true;
		}
		return false;

	}
	public String toString() {
		return this.content;
	}

}
