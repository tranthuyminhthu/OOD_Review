package ManageMusic;

import java.util.ArrayList;
import java.util.List;

public class searchBySinger implements searchBehavior {

	@Override
	public List<DigitalMusic> findDigitalMusic(String requirment, List<DigitalMusic> list) {

		List<DigitalMusic> result = new ArrayList<>();

		for (DigitalMusic digitalMusic : list) {
			if (requirment.equals(digitalMusic.getSinger()))
				result.add(digitalMusic);
		}
		return result;
		// TODO Auto-generated method stub
	}
}
