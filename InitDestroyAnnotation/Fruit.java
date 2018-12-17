package InitDestroyAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Fruit {
	//set default description
	private String description = "not set";

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	//set no arg constructor
	public Fruit () {}
	
	public String talkAboutYourSelf() {
		return description;
	}
	//initial init and destroy method
	@PostConstruct
	public void initMethod() {
		System.out.println("The fruit is starting, " + this.description);
	}
	@PreDestroy
	public void destroyMethod() {
		System.out.println("The fruit bean is about to be destroyed. ");
	}
}
