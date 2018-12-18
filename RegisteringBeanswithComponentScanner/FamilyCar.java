package RegisteringBeanswithComponentScanner;

import javax.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Component("familyCar")
public class FamilyCar {
	
	//in replacement of Named and (name="XXX") to remove ambiguity, we use the Qualifier annotation
	@Autowired
	@Qualifier("sixCyl")
	private Engine engineType;
	
	//similar to @Resource there will be ambiguity unless you set the name annotation


	public Engine getEngineType() {
		return engineType;
	}

	public void setEngineType(Engine engineType) {
		this.engineType = engineType;
	}

	
	public String getCarDescription() {
		String description = "";
		
		
		if(engineType!=null) {
			description += "Engine No. of Cylinders: " + engineType.getNumberOfCylinders()+"\n";
		}
		if(description == "") description  = "not set";
		return description;
	}
}
