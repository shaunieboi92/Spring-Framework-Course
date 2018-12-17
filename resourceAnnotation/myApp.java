package resourceAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myApp {
	public static void main(String[] args) {
		//we are going to use @resource JSR
		ApplicationContext appContextfourteen = new ClassPathXmlApplicationContext("myTestPackage/appContext14.xml");
		FamilyCar myFamilyCar = appContextfourteen.getBean("familyCar", FamilyCar.class);
		System.out.println(myFamilyCar.getCarDescription());
		
		((ClassPathXmlApplicationContext)appContextfourteen).close();
	}
	
	
	
}
