package hu.iit.uni.miskolc.hu.oop;

public class OvatosDiak extends Diak {
	private int quota;
	
	public OvatosDiak(String name, int money) {
		super(name, money);
	}
	
	public OvatosDiak(String name, int money, int quota) {
		super(name, money);
		this.quota = quota;
	}
	
	@Override
	public boolean drinkBeer(int price) {
		int buffer = this.getMoney();
		if((buffer-price) < quota) {
			return false;
		}
		this.setMoney(this.getMoney() - price);
		return true;
	}

	@Override
	public String toString() {
		return "Pénzmag: " + (this.getMoney()-quota);
	}

	
}
