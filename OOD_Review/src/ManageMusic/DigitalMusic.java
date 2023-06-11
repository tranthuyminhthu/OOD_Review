package ManageMusic;

public class DigitalMusic {

	private Music music;
	private String singer;
	private String link;
	private int numAccess;

	public DigitalMusic(Music music, String singer, String link, int numAccess) {
		super();
		this.music = music;
		this.singer = singer;
		this.link = link;
		this.numAccess = numAccess;
	}

	public Music getMusic() {
		return music;
	}

	public void setMusic(Music music) {
		this.music = music;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public int getNumAccess() {
		return numAccess;
	}

	public void setNumAccess(int numAccess) {
		this.numAccess = numAccess;
	}

	@Override
	public String toString() {
		return "DigitalMusic [music=" + music + ", singer=" + singer + ", link=" + link + ", numAccess=" + numAccess
				+ "]";
	}

}
