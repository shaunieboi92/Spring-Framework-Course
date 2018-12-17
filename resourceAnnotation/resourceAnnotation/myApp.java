package resourceAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myApp {
	public static void main(String[] args) {
		//we are going to use @resource JSR
		ApplicationContext appContextfourteen = new ClassPathXmlApplicationContext("myTestPackage/appContext14.xml");
		FamilyCar myFamilyCar = appContextfourteen.getBean("familyCar", FamilyCar.class);
		System.out.println(myFamilyCar.getCarDescription());
		//if simply run with declaring all the beans that implements Tire and Engine respectively, there is ambiguity
		 //No qualifying bean of type [resourceAnnotation.Engine] is defined: expected single matching bean but found 2: fourCyl,sixCyl
		((ClassPathXmlApplicationContext)appContextfourteen).close();
	}
	
	
	
}
