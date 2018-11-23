package mySimpleSpringApp;

import java.util.List;
import java.util.Map;

public class Fruit {
	private String myName;

	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	//create a no argument constructor
	
	//no argument constructor is required , bcause in ur spring bean configuration appContext.xml
	//its attempting use a no argument constructor 
	//<bean id = "fruit" class = "mySimpleSpringApp.Fruit"></bean>

	public Fruit(String pName) {
		setMyName(pName);
	}
	
	
	//now you want to create a list and mapping specifically for fruit
	private List<String> fruitNameList;
	private Map<String,String> fruitNameMap;
	public Fruit() {}
	
	public void setFruitNameMap(Map<String,String> fruitNameMap) {
		this.fruitNameMap = fruitNameMap;
	}
	public Map<String,String>getFruitNameMap() {
		return fruitNameMap;
	}
	public void setFruitNameList(List<String> fruitNameList) {
		this.fruitNameList = fruitNameList;
	}
	public List<String>getFruitNameList() {
		return fruitNameList;
	}


	public String talkAboutYourSelf() {
		String speech = "Hi I am a fruit. I come from plants or trees with seeds. ";
		
		//if myName/pName property is set, talkaboutyourself method will let us know what that name is in that instance of Fruit
		//hence we add
		if(myName!=null && myName!="") {
			speech = speech + "My name is : " + myName;
		}
			//difference between null and "" is that
			//"" is an actual string, an empty one
			//null means that the variable points to nothing
			//meaning myName points to nothing.
		
		if(fruitNameList !=null && fruitNameList.size()>0) {
			speech += "\nList: ";
			//inline
			for(int i = 0 ;i<fruitNameList.size();i++) {
				speech +=   fruitNameList.get(i) + ", ";
			}
		}
		
		if(fruitNameMap!=null && fruitNameMap.size()>0) {
			speech += "\nMap: ";
			//inline
			for(Map.Entry<String,String> fruitName:fruitNameMap.entrySet()) {
				speech += fruitName.getKey() + " ==>" +fruitName.getValue() + "::";
			}
		}
		
		return speech;
	}
}
