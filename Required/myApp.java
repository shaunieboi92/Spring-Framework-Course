package Required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import mySimpleSpringApp.Vegetable;

public class myApp {
	public static void main (String args[] ) {
	
		ApplicationContext appContexteleven = new ClassPathXmlApplicationContext("myTestPackage/appContext11.xml");
		
		Fruit fruit = appContexteleven.getBean("fruit",Fruit.class);

		System.out.println(fruit.talkAboutYourSelf());

	
		((ClassPathXmlApplicationContext)appContexteleven).close();

	}
}
