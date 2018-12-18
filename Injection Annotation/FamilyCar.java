package resourceAnnotation;

import javax.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import javax.inject.Inject;
import javax.inject.Named;

public class FamilyCar {
	//do autowiring
	//@Resource has a name attribute that is able to remove ambiguity that points to the same interface
	//we have to set the (name = "XXXX") to the bean id in the appContext that we want to point to
//	@Autowired
//	@Resource(name = "bigTire")
	//@Inject will give the same kind of autowire functionality
	@Inject
	@Named("smallTire")
	private Tire frontLeft;
	
//	@Autowired
//	@Resource(name = "bigTire")
	@Inject
	@Named("smallTire")
	private Tire frontRight;
	
//	@Autowired
//	@Resource(name = "bigTire")
	@Inject
	@Named("smallTire")
	private Tire rearLeft;
	
//	@Autowired
//	@Resource(name = "bigTire")
	@Inject
	@Named("smallTire")
	private Tire rearRight;
	
//	@Autowired
//	@Resource(name = "sixCyl")
	@Inject
	@Named("fourCyl")
	private Engine engineType;
	
	//similar to @Resource there will be ambiguity unless you set the name annotation
	
	public Tire getFrontLeft() {
		return frontLeft;
	}

	public void setFrontLeft(Tire frontLeft) {
		this.frontLeft = frontLeft;
	}

	public Tire getFrontRight() {
		return frontRight;
	}

	public void setFrontRight(Tire frontRight) {
		this.frontRight = frontRight;
	}

	public Tire getRearLeft() {
		return rearLeft;
	}

	public void setRearLeft(Tire rearLeft) {
		this.rearLeft = rearLeft;
	}

	public Tire getRearRight() {
		return rearRight;
	}

	public void setRearRight(Tire rearRight) {
		this.rearRight = rearRight;
	}

	public Engine getEngineType() {
		return engineType;
	}

	public void setEngineType(Engine engineType) {
		this.engineType = engineType;
	}

	
	public String getCarDescription() {
		String description = "";
		
		if(frontLeft!=null) {
			description += "Front left tire: " + frontLeft.getTireDiameter() +"\n";
		}
		if(frontRight!=null) {
			description += "Front right tire: " + frontRight.getTireDiameter()+"\n";
		}
		if(rearLeft!=null) {
			description += "Rear left tire: " + rearLeft.getTireDiameter()+"\n";
		}
		if(rearRight!=null) {
			description += "Rear right tire: " + rearRight.getTireDiameter()+"\n";
		}
		if(engineType!=null) {
			description += "Engine No. of Cylinders: " + engineType.getNumberOfCylinders()+"\n";
		}
		if(description == "") description  = "not set";
		return description;
	}
}
