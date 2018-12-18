package RegisteringBeanswithComponentScanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myApp {
	public static void main(String[] args) {
		//we are going to use @resource JSR
		ApplicationContext appContextfifthteen = new ClassPathXmlApplicationContext("myTestPackage/appContext15.xml");
		
		//similar to previous, getBean based on the attached ID
		FourCylinderEngine myFour = appContextfifthteen.getBean("fourCyl", FourCylinderEngine.class);
		
		System.out.println("MyFour: " + myFour.getNumberOfCylinders());
		
		SixCylinderEngine mySix = appContextfifthteen.getBean("sixCyl", SixCylinderEngine.class);
		
		System.out.println("MySix: " + mySix.getNumberOfCylinders());
		
		FamilyCar myFamilyCar = appContextfifthteen.getBean("familyCar",FamilyCar.class);
		
		System.out.println("FamilyCar:" + myFamilyCar.getCarDescription());
		((ClassPathXmlApplicationContext)appContextfifthteen).close();
	}
	
	
	
}
