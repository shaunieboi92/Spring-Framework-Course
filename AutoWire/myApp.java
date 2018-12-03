package AutoWire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import mySimpleSpringApp.Vegetable;

public class myApp {
	public static void main (String args[] ) {
	
		ApplicationContext appContextsix = new ClassPathXmlApplicationContext("myTestPackage/appContext6.xml");
		
		MealwAutoWirebyType Mealnormal = (MealwAutoWirebyType)appContextsix.getBean("meal",MealwAutoWirebyType.class);
		
		MealwAutoWirebyType MealAWBT = (MealwAutoWirebyType)appContextsix.getBean("mealAutoWired",MealwAutoWirebyType.class);

		//this is the normal type
		System.out.println("Spring meal without Autowire: " + Mealnormal.whatsInThisMeal());

		
		//this is the autowired type,  both of them should return the same values
		System.out.println("Spring meal with Autowire: " + MealAWBT.whatsInThisMeal());

		//close spring framework

		//((ClassPathXmlApplicationContext)appContext2).close();
		((ClassPathXmlApplicationContext)appContextsix).close();

	}
}
