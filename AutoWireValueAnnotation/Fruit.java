package AutoWireValueAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Fruit {
	public String description = "not set";
	

	public String getDescription() {
		return description;
	}
	//first we set autowired, then we set autovalue
	@Autowired
	public void setDescription(@Value("Hi I am a fruit, my description is based on Value Annotation") String description) {
		this.description = description;
	}

	public String talkAboutYourSelf() {
		return description;
	}
}
