package AutoWire;

public class MealwAutoWirebyType {
	//AutoWire will see through these fields, and the methods to determine type
	private Fruit fruit;
	private Dairy dairy;
	private Grain grain;
	private Meat meat;
	private Vegetable vegetable;
	


	public MealwAutoWirebyType() {}
	
	public Vegetable getVegetable() {
		return vegetable;
	}
	public void setVegetable(Vegetable vegetable) {
		this.vegetable = vegetable;
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
		if(vegetable!=null) answer += "some vegetable:";

		return answer;
	}
}
