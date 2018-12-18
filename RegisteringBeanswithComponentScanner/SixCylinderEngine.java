package RegisteringBeanswithComponentScanner;

import org.springframework.stereotype.Component;

@Component("sixCyl")
public class SixCylinderEngine implements Engine{
	public int getNumberOfCylinders() {
		return 6;
	}
	
	public String drive() {
		return "Driving efficiently with 6 cylinders";
	}
}
