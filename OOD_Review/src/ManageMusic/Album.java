package ManageMusic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Album {

	private String title;
	private Date releaseDate;
	private String brand;
	private List<DigitalMusic> listMusic = new ArrayList<>();

	public Album(String title, Date releaseDate, String brand, List<DigitalMusic> listMusic) {
		super();
		this.title = title;
		this.releaseDate = releaseDate;
		this.brand = brand;
		this.listMusic = listMusic;
	}

}
