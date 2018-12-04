package InitandDestroyMethodson;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
public class Fruit2 {
	//set default description as not set
	private String description = "not set";

	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	//create no argument constructor
	public Fruit2 () {}
	
	public String talkAboutYourSelf() {
		return description;
	}
	
	//set initmethod and destroymethod
	//will be void since they are not returning any value
	
	//these initMethod() and destroyMethod() will be referenced in the appContext
	//it will be set automatically before and after the main called methods
	
	@PostConstruct
	public void initMethod() {
		System.out.println("The fruit bean is ready to go, this is with init annotation.");
	}
	@PreDestroy
	//destroy method will be shown right before the close
	public void destroyMethod() {
		System.out.println("The fruit bean is about to be destroyed, this is with destroy annotation. ");
	}
	
}
