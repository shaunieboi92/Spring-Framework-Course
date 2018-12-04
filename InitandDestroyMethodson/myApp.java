package InitandDestroyMethodson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class myApp {
	public static void main (String args[] ) {
		
		ApplicationContext appContext5 = new ClassPathXmlApplicationContext("myTestPackage/appContext5.xml");
		ApplicationContext appContext12 = new ClassPathXmlApplicationContext("myTestPackage/appContext12.xml");


		Fruit myFruit = appContext5.getBean("fruitwithDestroyer", Fruit.class);
		Fruit2 anotherFruit = appContext12.getBean("fruitwithDestroyer", Fruit2.class);

		System.out.println(myFruit.talkAboutYourSelf());
		System.out.println(anotherFruit.talkAboutYourSelf());

		//close spring framework
		
		((ClassPathXmlApplicationContext)appContext5).close();
		((ClassPathXmlApplicationContext)appContext12).close();

	}
}
