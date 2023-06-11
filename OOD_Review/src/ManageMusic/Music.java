package ManageMusic;

public class Music {

	private String titleSong;
	private String lyric;
	private String musican;
	private String type;

	public Music(String titleSong, String lyric, String musican, String type) {
		super();
		this.titleSong = titleSong;
		this.lyric = lyric;
		this.musican = musican;
		this.type = type;
	}

	public String getTitleSong() {
		return titleSong;
	}

	public void setTitleSong(String titleSong) {
		this.titleSong = titleSong;
	}

	public String getLyric() {
		return lyric;
	}

	public void setLyric(String lyric) {
		this.lyric = lyric;
	}

	public String getMusican() {
		return musican;
	}

	public void setMusican(String musican) {
		this.musican = musican;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Music [titleSong=" + titleSong + ", lyric=" + lyric + ", musican=" + musican + ", type=" + type + "]";
	}

}
