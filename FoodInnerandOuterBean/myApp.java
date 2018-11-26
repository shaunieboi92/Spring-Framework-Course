package FoodInnerandOuterBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class myApp {
	public static void main (String args[] ) {
		
		//ApplicationContext appContext2 = new ClassPathXmlApplicationContext("myTestPackage/appContext2.xml");
		//ApplicationContext appContext2 = new ClassPathXmlApplicationContext("myTestPackage/appContext2.xml");

		ApplicationContext appContext4 = new ClassPathXmlApplicationContext("myTestPackage/appContext4.xml");
		
		//here we are using a normal calling and creating a Meal Object
		Meal myNormalMeal = new Meal();
		//you will expect that without using the bean construction, all classes will be null.
		//hence you will see
//		Spring meal: This meal contains: 
//			no fruit, no dairy, no grain, no meat, no vege, 
		
		//based on appContext2
		//Meal  mySpringMeal = appContext2.getBean("meal",Meal.class);
		
		//based on appContext4, constructor injection
		MealwConstructorInjection myInjectionMeal = appContext4.getBean("mealwInj",MealwConstructorInjection.class);

		System.out.println("Spring meal: " + myNormalMeal.whatsInThisMeal());
		//System.out.println("Spring meal: " + mySpringMeal.whatsInThisMeal());
		System.out.println("Spring meal: " + myInjectionMeal.whatsInThisMeal());

		
		//close spring framework

		//((ClassPathXmlApplicationContext)appContext2).close();
		((ClassPathXmlApplicationContext)appContext4).close();

	}
}
