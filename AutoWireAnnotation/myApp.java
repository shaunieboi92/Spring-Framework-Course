package AutoWireAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import mySimpleSpringApp.Vegetable;

public class myApp {
	public static void main (String args[] ) {
	
		ApplicationContext appContexteight = new ClassPathXmlApplicationContext("myTestPackage/appContext8.xml");
		
		Meal Meal = appContexteight.getBean("meal",Meal.class);

		MealwAnnotation MealAnnotation = (MealwAnnotation)appContexteight.getBean("mealByAnnotation",MealwAnnotation.class);

		//this is the autowired type,  both of them should return the same values
		System.out.println("Spring meal with no annotation: " + Meal.whatsInThisMeal());

		System.out.println("Spring meal with AutowireAnnotation: " + MealAnnotation.whatsInThisMeal());

		//close spring framework

		//((ClassPathXmlApplicationContext)appContext2).close();
		((ClassPathXmlApplicationContext)appContexteight).close();

	}
}
