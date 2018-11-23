package mySimpleSpringApp;

public class Vegetable {
	private String myName;
	
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}

	public Vegetable() {}
	//no argument constructor is required , bcause in ur spring bean configuration appContext.xml
	//its attempting use a no argument constructor 
	//<bean id = "fruit" class = "mySimpleSpringApp.Fruit"></bean>

	public Vegetable(String pName) {
		setMyName(pName);
	}
	public String talkAboutYourSelf() {
		String speech = "Hi I am a plant. ";
		
		//if myName/pName property is set, talkaboutyourself method will let us know what that name is in that instance of Fruit
		//hence we add
		if(myName!=null && myName!="") {
			speech = speech + "My name is : " + myName;
		}
			//difference between null and "" is that
			//"" is an actual string, an empty one
			//null means that the variable points to nothing
			//meaning myName points to nothing.
		return speech;
	}
}

