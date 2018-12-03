package AutoWirebyConstructor;

import org.springframework.beans.factory.annotation.Autowired;

public class Meal {

	private Fruit fruit;
	private Dairy dairy;
	private Grain grain;
	private Meat meat;
	private Vegetable veg;

	//default no args constructor
	public Meal() {}
	
	//Full meal constructor
	public Meal(Fruit f, Dairy d, Grain g, Meat m, Vegetable v) {
		this.fruit = f;
		this.dairy = d;
		this.grain = g;
		this.meat = m;
		this.veg = v;
	}
	public Vegetable getVegetable() {
		return veg;
	}
	public void setVegetable(Vegetable veg) {
		this.veg = veg;
	}
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

	public String whatsInThisMeal() {
		String answer = "This meal contains: \n";
		
		if(fruit!=null) answer += "some fruit: " ;
		if(dairy!=null) answer += "some dairy: " ;
		if(grain!=null) answer += "some grain: " ;
		if(meat!=null)answer += "some meat: " ;
		if(veg!=null) answer += "some vegetable:";

		return answer;
	}
}
