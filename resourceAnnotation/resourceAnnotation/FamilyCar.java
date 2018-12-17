package resourceAnnotation;

import javax.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

public class FamilyCar {
	//do autowiring
	
//	@Autowired
	@Resource
	private Tire frontLeft;
	
//	@Autowired
	@Resource

	private Tire frontRight;
	
//	@Autowired
	@Resource
	private Tire rearLeft;
	
//	@Autowired
	@Resource
	private Tire rearRight;
	
//	@Autowired
	@Resource
	private Engine engineType;
	
	
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
