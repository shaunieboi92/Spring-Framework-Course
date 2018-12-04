package AutoWireValueAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import mySimpleSpringApp.Vegetable;

public class myApp {
	public static void main (String args[] ) {
	
		ApplicationContext appContextten = new ClassPathXmlApplicationContext("myTestPackage/appContext10.xml");
		
		Fruit myFruit = appContextten.getBean("fruit",Fruit.class);

		Fruit anotherFruit = appContextten.getBean("anotherFruit",Fruit.class);
		//this is the autowired type,  both of them should return the same values
		
		//this will return the description based on the XML config description
		System.out.println(myFruit.talkAboutYourSelf());

		//this will return the description based on the value annotation in the Fruit.java
		System.out.println(anotherFruit.talkAboutYourSelf());

		//close spring framework

		//((ClassPathXmlApplicationContext)appContext2).close();
		((ClassPathXmlApplicationContext)appContextten).close();

	}
}
