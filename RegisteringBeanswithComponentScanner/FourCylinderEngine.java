package RegisteringBeanswithComponentScanner;

import org.springframework.stereotype.Component;

//use @Component annotation
@Component("fourCyl") //where fourCyl is the attached id to the class
public class FourCylinderEngine implements Engine{
	public int getNumberOfCylinders() {
		return 4;
	}
	
	public String drive() {
		return "Driving efficiently with 4 cylinders";
	}
}
