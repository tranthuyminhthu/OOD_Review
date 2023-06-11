package ManageMusic;

import java.util.ArrayList;
import java.util.List;

public class searchBySong implements searchBehavior {

	@Override
	public List<DigitalMusic> findDigitalMusic(String requirment, List<DigitalMusic> list) {
		// TODO Auto-generated method stub

		List<DigitalMusic> result = new ArrayList<>();
		for (DigitalMusic digitalMusic : list) {
			if (requirment.equals(digitalMusic.getMusic().getTitleSong()))
				result.add(digitalMusic);
		}

		return result;
	}

}
