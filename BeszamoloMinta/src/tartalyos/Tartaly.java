package tartalyos;

public class Tartaly extends Tarolo { // 1
	private double nyomas; // 1

	public Tartaly(int terfogat, double nyomas) { // 1
		super(terfogat);
		this.nyomas = nyomas;
	}
	
	public boolean nagyobbNyomas(Tartaly tartaly){
		return this.nyomas > tartaly.nyomas;
	}
	
	public static Tartaly nagyobbTartaly(Tartaly tartaly1, Tartaly tartaly2){  // 1
		if(tartaly1.getTerfogat() > tartaly2.getTerfogat())
			return tartaly1;
		else
			return tartaly2;
		
	}

	@Override
	public boolean veszelyes() { // 1
		if(this.getTerfogat() * this.nyomas > 100){
			return true;
		}
		else
			return false;
		
	}
	
	@Override
	public String toString() {  // 1
		if(this.veszelyes() == true){
			return "Tartaly: nyomas = " + nyomas + ", terfogat:" + getTerfogat() + "Veszelyes";
		}
		else{
			return "Tartaly: nyomas = " + nyomas + ", terfogat:" + getTerfogat() + "Nem Veszelyes";
		}
	}
	

}
