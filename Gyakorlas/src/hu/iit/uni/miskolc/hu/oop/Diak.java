package hu.iit.uni.miskolc.hu.oop;

public class Diak {
	private String name;
	private int money;
	
	public Diak(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public int getMoney() {
		return money;
	}
	
	public boolean drinkBeer(int price) {
		int buffer = this.money;
		if((buffer-price) < 0) {
			return false;
		}
		this.money -= price;
		return true;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	

}
