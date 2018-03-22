package iit.uni.miskolc.oop;

public class MusicDisc {
	
	private String performer;
	private String name;
	private int length;
	
	//1, Konstruktor készítés
	public MusicDisc(String performer, String name, int length){
		this.performer = performer;
		this.name = name;
		this.length = length;
	}

	public String toString() {
		return performer + ": " + name + ", " + length + "perc";
	}
	
	public int LSE(MusicDisc disc){ //LSE stands for: Longer, Shorter or Equal?
		if(this.length > disc.length){
			return 1;
		}
		else if(this.length < disc.length){
			return -1;
		}
		else{
			return 0;
		}
	}
	public boolean isPerformer(String performer){
		return performer.equalsIgnoreCase(this.performer);
	}

	public String getPerformer() {
		return performer;
	}

	public String getName() {
		return name;
	}

	public int getLength() {
		return length;
	}

}
