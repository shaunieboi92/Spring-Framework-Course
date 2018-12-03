package AutoWirebyConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import mySimpleSpringApp.Vegetable;

public class myApp {
	public static void main (String args[] ) {
	
		ApplicationContext appContextnine = new ClassPathXmlApplicationContext("myTestPackage/appContext9.xml");
		
		Meal Meal = appContextnine.getBean("meal",Meal.class);

		Meal MealwAutoWirebByConstructor = appContextnine.getBean("mealAutoWireByConstructor", Meal.class);

		//this is the autowired type,  both of them should return the same values
		System.out.println("Spring meal with no Autowire: " + Meal.whatsInThisMeal());

		System.out.println("Spring meal with AutowirebyConstructor: " + MealwAutoWirebByConstructor.whatsInThisMeal());

		//close spring framework

		//((ClassPathXmlApplicationContext)appContext2).close();
		((ClassPathXmlApplicationContext)appContextnine).close();

	}
}
