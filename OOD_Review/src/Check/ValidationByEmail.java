package Check;

public class ValidationByEmail implements ValidationBehavior {

	@Override
	public boolean validation(String data) {
		// TODO Auto-generated method stub
		char[] x = data.toCharArray();
		for (int i = 0; i < x.length; i++) {
			x[i] = '@';
			return true;
		}
		return false;
	}

}
