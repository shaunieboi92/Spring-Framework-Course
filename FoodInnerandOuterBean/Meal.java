package FoodInnerandOuterBean;

public class Meal {
	private Fruit fruit;
	private Dairy dairy;
	private Grain grain;
	private Meat meat;
	private Vegetable veg;
	
	
	public Fruit getFruit() {
		return fruit;
	}
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	public Dairy getDairy() {
		return dairy;
	}
	public void setDairy(Dairy dairy) {
		this.dairy = dairy;
	}
	public Grain getGrain() {
		return grain;
	}
	public void setGrain(Grain grain) {
		this.grain = grain;
	}
	public Meat getMeat() {
		return meat;
	}
	public void setMeat(Meat meat) {
		this.meat = meat;
	}
	public Vegetable getVeg() {
		return veg;
	}
	public void setVeg(Vegetable veg) {
		this.veg = null;
	}
	
	public String whatsInThisMeal() {
	
		String answer = "This meal contains: \n";
	
		if(fruit!=null) {answer += fruit.talkAboutYourSelf() + "\n"; }else answer += "no fruit, " ;
		if(dairy!=null) {answer += dairy.talkAboutYourSelf() + "\n" ;}else answer += "no dairy, " ;
		if(grain!=null) {answer += grain.talkAboutYourSelf() + "\n";}else answer += "no grain, " ;
		if(meat!=null){answer += meat.talkAboutYourSelf() + "\n";}else answer += "no meat, " ;
		if(veg!=null) {answer += veg.talkAboutYourSelf() + "\n";}else answer += "no vege, " ;

		return answer;
	}
	
	
}
