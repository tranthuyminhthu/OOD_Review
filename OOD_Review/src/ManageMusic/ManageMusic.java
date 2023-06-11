package ManageMusic;

import java.util.ArrayList;
import java.util.List;

public class ManageMusic {

	private List<DigitalMusic> list = new ArrayList<>();

	private searchBehavior searchBehavior;
	private Sort sort;

	public ManageMusic(List<DigitalMusic> list, searchBehavior searchBehavior, Sort sort) {
		super();
		this.list = list;
		this.searchBehavior = searchBehavior;
		this.sort = sort;
	}
	
	public List<DigitalMusic> findDigitalMusic (String requirment) {
		return searchBehavior.findDigitalMusic(requirment, list);
		
		
	}
	
	public List<DigitalMusic> sortSigitalMusic(String requirment){
		return sort.sortSigitalMusic(requirment);
	}

}
