package InitandDestroyMethodson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class myApp {
	public static void main (String args[] ) {
		
		ApplicationContext appContext5 = new ClassPathXmlApplicationContext("myTestPackage/appContext5.xml");
		

		Fruit myFruit = appContext5.getBean("fruitwithDestroyer", Fruit.class);

		System.out.println(myFruit.talkAboutYourSelf());
		//close spring framework
		
		((ClassPathXmlApplicationContext)appContext5).close();
	}
}
