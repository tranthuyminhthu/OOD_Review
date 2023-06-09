package Check_Text;

public class Test {

	public static void main(String[] args) {

		Strategy strategy = new CheckEmail();
		TextComponent checkmail = new TextComponent("trannn@", strategy);
		System.out.println(checkmail + " is mail " + checkmail.validation());

		Strategy strategy1 = new CheckNumber();
		TextComponent checknumber = new TextComponent("9.3.4", strategy1);
		System.out.println(checknumber + " is number " + checknumber.validation());

		Strategy strategy2 = new CheckNumber();
		TextComponent checkphone = new TextComponent("08222148283930", strategy1);
		System.out.println(checkphone + " is number phone " + checkphone.validation());

	}
}
