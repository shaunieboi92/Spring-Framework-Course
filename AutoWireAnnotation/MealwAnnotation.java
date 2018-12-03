package AutoWireAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class MealwAnnotation {
	//AutoWire will see through these fields, and the methods to determine type
	//1)
	@Autowired
	private Fruit fruit;
	@Autowired
	private Dairy dairy;
	@Autowired
	private Grain grain;
	@Autowired
	private Meat meat;
	@Autowired
	private Vegetable veg;
	
//we are going to use the @AutoWire annotation
//2 places to place the annotation,
	//1) is above each of the private properties.
	//2) is above each of the setter methods.
	
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
