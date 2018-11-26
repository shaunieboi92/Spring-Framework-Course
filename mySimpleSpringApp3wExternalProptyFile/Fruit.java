package mySimpleSpringApp3wExternalProptyFile;

import java.util.List;
import java.util.Map;

public class Fruit {
	//here we set the default value of the property name defnition to not set
	//it is initialize as such until we grab the property from an external file or change it internally
	private String definition = "not set";

	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}
	
	//again create a no-argument constructor
	
	public Fruit() {}
	
	public String talkAboutYourSelf() {
		return definition;
	}
	
	

	
}
