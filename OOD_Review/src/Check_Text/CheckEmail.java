package Check_Text;

public class CheckEmail implements Strategy {

	@Override
	public boolean validation(String data) {
		// TODO Auto-generated method stub
		char[] x = data.toCharArray();
		for (int i = 0; i < x.length; i++) {
			if (x[i] == '@') {
				return true;

			}

		}
		return false;
	}

}
