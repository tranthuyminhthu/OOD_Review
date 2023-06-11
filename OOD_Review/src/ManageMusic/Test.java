package ManageMusic;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		Music m1 = new Music("em cua ngay hom qua", "lyric", "Duy Vu", "abc");
		Music m2 = new Music("em cua ngay hom qua ne", "lyric", "Duy Vu", "abc");
		Music m3 = new Music("em cua ngay hom qua dung hon", "lyric", "Duy Vu", "abc");
		Music m4 = new Music("em cua ngay hom qua do", "lyric", "Duy Vu", "abc");
		DigitalMusic d1 = new DigitalMusic(m1, "hihi", "abc.com", 10);
		DigitalMusic d2 = new DigitalMusic(m2, "hihi", "abc.com", 18);
		DigitalMusic d3 = new DigitalMusic(m3, "hihi", "abc.com", 19);
		List<DigitalMusic> list = new ArrayList<>();
		list.add(d1);
		list.add(d2);
		list.add(d3);
		ManageMusic m = new ManageMusic(list, new searchBySong(), new sortBySong());
		System.out.println(m.findDigitalMusic("em cua ngay hom qua"));
		
	}

}
