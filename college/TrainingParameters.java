package gu_test2;

import java.util.HashMap;
import java.util.Map;

public enum TrainingParameters {
	
	COACH("COACH"),
	DATE("DATE"),
	LOCATION("LOCATION"),
	TIME("TIME"),
	SKILLS("SKILLS"),
	ACTIVITIES("ACTIVITIES"),
	PLIST("PLAYERS LIST"),
	INJURIES("INJURIES"),
	NOTES("NOTES");
	
private String param;
	
	private static Map<String,TrainingParameters> paraMap = new HashMap<String, TrainingParameters>(); //hashmap to pass 
	
	static {
		for(TrainingParameters param: TrainingParameters.values()) { //populate hashmap
			paraMap.put(param.getParamStr(),param);
		}//for loop
	}//static
	
	
	TrainingParameters(String param) { //initialise param variable
		this.param = param;
	}//TrainingParameters
	
	
	public String getParamStr() { 
		return this.param;
	}//getParamStr
	
	public static TrainingParameters getParam(String param) {

		return paraMap.get(param);

	}//getParam
}//TrainingParameters
