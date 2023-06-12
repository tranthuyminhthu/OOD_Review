package Check;

public class ValidationByNumberPhone implements ValidationBehavior {

	@Override
	public boolean validation(String data) {
		// TODO Auto-generated method stub
		if (data.length() != 10) {
			return false;
		} else if (data.startsWith("08")) {
			return true;
		}

		return false;
	}

}
