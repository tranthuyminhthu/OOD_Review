package Check_Text;

public class CheckNumberPhone implements Strategy {

	@Override
	public boolean validation(String data) {
		// TODO Auto-generated method stub
		if (data.length() != 10) {
			return false;

		} else if (data.startsWith("08")) {
			return false;
		}
		return true;
	}

}
