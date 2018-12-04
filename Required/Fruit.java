package Required;

import org.springframework.beans.factory.annotation.Required;

public class Fruit {
	private String description;
	public String getDescription() {
		return description;
	}
	//put the Required Annotation on the setDescription Method
	//upon doing this, without the description property in place
	//console output error in creating Bean with name 'fruit' .Property 'description' is required for bean 'fruit'
	@Required
	public void setDescription(String description) {
		this.description = description;
	}
	//create no argument constructor
	public Fruit() {}
	
	public String talkAboutYourSelf() {
		String result = description;
		if(result == null) {
			result = "no description set";
		}return result;
	}
	
}
