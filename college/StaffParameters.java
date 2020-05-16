package gu_test2;

import java.util.HashMap;
import java.util.Map;

public enum StaffParameters {
	
	SFUNUM("SFU_NUM"),
	NAME("NAME"),
	SURNAME("SURNAME"),
	AGE("AGE"),
	DOB("DATE OF BIRTH"),
	HOUSENUMBER("HOUSE N"),
	ADDRESS("ADDRESS"),
	POSTCODE("POSTCODE"),
	TELNUMBER("TEL NUMBER"),
	MOBILENUMBER("MOBILE NUMBER"),
	EMAIL("EMAIL"),
	FEES("FEES"),
	FEESEXP("FEES EXP");
	
private String param;
	
	private static Map<String,StaffParameters> paraMap = new HashMap<String,StaffParameters>(); //hashmap to pass 
	
	static {
		for(StaffParameters param: StaffParameters.values()) { //populate hashmap
			paraMap.put(param.getParamStr(),param);
		}//for loop
	}//static
	
	
	StaffParameters(String param) { //inizialize param variable
		this.param = param;
	}//StaffParameters
	
	
	public String getParamStr() { 
		return this.param;
	}//getParamStr
	
	public static StaffParameters getParam(String param) {

		return paraMap.get(param);
		
	}//getParam
	
}//StaffParameters
