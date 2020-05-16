package gu_test2;

import java.util.HashMap;
import java.util.Map;

public enum GamesParameters {

	DATE("DATE"),
	LOCATION("LOCATION"),
	OPPOSITION("OPPOSITION"),
	KICKOFF("KICK-OFF TIME"),
	RESULT("RESULT"),
	FIRSTHALF("HT SCORE"),
	SECONDHALF("2H SCORE"),
	FINAL("FINAL SCORE"),
	COMMENTS("COMMENTS");
	
private String param;
	
	private static Map<String,GamesParameters> paraMap = new HashMap<String,GamesParameters>(); //hashmap to pass 
	 static{
		for(GamesParameters param: GamesParameters.values()) { //populate hashmap
			paraMap.put(param.getParamStr(),param);
		}//for loop
	}//static
	
	
	GamesParameters(String param) { //initialise param variable
		this.param = param;
	}//GamesParameters
	
	
	public String getParamStr() { 
		return this.param;
	}//getParamStr
	
	public static GamesParameters getParam(String param) {

		return paraMap.get(param);
		
	}//getParam
	
}//GamesParameter
