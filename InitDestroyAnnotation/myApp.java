package InitDestroyAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class myApp {
	public static void main (String args[] ) {
		
		ApplicationContext appContext13 = new ClassPathXmlApplicationContext("myTestPackage/appContext13.xml");


		Fruit myFruit = appContext13.getBean("fruit", Fruit.class);

		System.out.println(myFruit.talkAboutYourSelf());

		//close spring framework
		
		((ClassPathXmlApplicationContext)appContext13).close();

	}
}
