package Check_Text;

public class CheckNumber implements Strategy {

	@Override
	public boolean validation(String data) {
		// TODO Auto-generated method stub
		if (data == null) {
			return false;
		} else if (data.matches("^\\d+(\\.\\d{0,1})?$")) {
			return true;
		}

		return false;
	}

}
