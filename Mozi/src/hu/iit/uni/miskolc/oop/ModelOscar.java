package hu.iit.uni.miskolc.oop;

public class ModelOscar extends Model{

	private int yearOfWinning;
	private String winningCategory;
	
	
	public ModelOscar(Model movie, int yearOfWinning, String winningCategory) {
		super(movie);
		this.yearOfWinning = yearOfWinning;
		this.winningCategory = winningCategory;
	}


	@Override
	public String toString() {
		return "Oszkar dijas film:" + super.toString() +  "yearOfWinning: " + yearOfWinning + ", winningCategory=" + winningCategory;
	}

	

}
