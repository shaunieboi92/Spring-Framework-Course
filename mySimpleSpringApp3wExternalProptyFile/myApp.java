package mySimpleSpringApp3wExternalProptyFile;

import java.io.File;
import java.io.FileNotFoundException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class myApp {

	public static void main (String args[] ) {
//		String dirPath = "C:\\Users\\shaun.lee\\eclipse-workspace\\mySimpleSpringApp";
//		String Context3FileName ="src/main/java/myTestPackage/appContext3.xml";
//		File file = new File(dirPath + File.separator + Context3FileName);
//
//		if(!file.exists()) {
//			System.out.println("File not found");
//		}else {

		try {
			ApplicationContext appContext3 = new ClassPathXmlApplicationContext("myTestPackage/appContext3.xml");
			Fruit myFruit = appContext3.getBean("fruit", Fruit.class);
			
			Vegetable myVegetable = (Vegetable)appContext3.getBean("vegetable", Vegetable.class);
			
			System.out.println(myVegetable.talkAboutYourSelf());//Hi I am a vegetable, I am not refered externally

			System.out.println(myFruit.talkAboutYourSelf());//notset
		
			Fruit myOtherFruit  =appContext3.getBean("externalFruit",Fruit.class);
			System.out.println(myOtherFruit.talkAboutYourSelf());//"Hi I am a fruit, I come from plants or trees with seeds."

	
			//close spring framework
			//you will realise that the definition for original myFruit is "not set" because there is no property set for it
			((ClassPathXmlApplicationContext)appContext3).close();
		
		}
		catch (Exception e){
			e.printStackTrace();
		}
			

	}
	
}

