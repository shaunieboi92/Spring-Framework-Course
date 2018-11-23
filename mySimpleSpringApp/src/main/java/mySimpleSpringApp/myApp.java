package mySimpleSpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class myApp {
	public static void main (String args[] ) {
		//Fruit fruit = new Fruit();
		
		//to get reference to appcontext.xml, which the spring applciation container
		//ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
		//recreate fruit through spring app cotnainner
		//if you are going to place your appcontext into a folder, you have to change to classpath
		//myTestPackage is now stored in the class path instead of external to src hence change to ClassPathXmlApplicationContext
		ApplicationContext appContext = new ClassPathXmlApplicationContext("myTestPackage/appContext.xml");
		
//		Fruit myFruit = appContext.getBean("fruit", Fruit.class);
//		//another way of writing is via kiash, or dont write kiash(Vegetable) also can
//		Vegetable myVegetable = (Vegetable)appContext.getBean("vegetable", Vegetable.class);
//		
//		
//		
//		//general format
//		//ClassName varName = appContext.getBean("appContext id", className.class);
//
		Fruit myOtherFruit = appContext.getBean("fruitwithName", Fruit.class);
		
		//collection type
		Fruit myMultipleFruit = appContext.getBean("fruitWithListAndMap", Fruit.class);

//		System.out.println(myFruit.talkAboutYourSelf());
//		System.out.println(myVegetable.talkAboutYourSelf());
		System.out.println(myOtherFruit.talkAboutYourSelf());
		System.out.println(myMultipleFruit.talkAboutYourSelf());

		//close spring framework
		
		((ClassPathXmlApplicationContext)appContext).close();
	}
}
