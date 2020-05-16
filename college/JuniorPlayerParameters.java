package gu_test2;

import java.util.HashMap;
import java.util.Map;

public enum JuniorPlayerParameters {
	
	SFUNUM("SFU NUM"),
	NAME("NAME"),
	SURNAME("SURNAME"),
	AGE("AGE"),
	DOB("DATE OF BIRTH"),
	TELNUMBER("TEL NUMBER"),
	MOBILENUMBER("MOBILE NUMBER"),                       
	EMAIL("EMAIL"),
	HOUSEN("HOUSE N"),                    
	ADDRESS("ADDRESS"),        
	POSTCODE("POSTCODE"),           
	GUARDNAME("GUARDIAN'S NAME"),
	GUARDHOUSEN("GUARDIAN'S HOUSE NUM"),
	GUARDADD("GUARDIAN'S ADDRESS"),
	GUARDIANPOST("GUARDIAN'S POSTCODE"),
	GUARDIANTEL("GUARDIAN'S TEL"),
	GUARDRELAT("RELATIONSHIP"),
	SECGUARDNAME("2nd GUARDIAN'S NAME"),
	SECGUARDHOUSNUM("2nd GUARD.'S HOUSE NUM"),
	SECGUARDADD("2nd GUARDIAN'S ADDRESS"),
	SECGUARDPOST("2nd GUARD.'S POSTC"),
	SECGUARDTEL("2nd GUARD.'S TEL"),
	SECGUARDREL("2nd GUARD.RELATION"),
	DOCTORNAME("DOCTOR NAME"),     
	DOCTORNUMBER("DOCTOR NUMBER"),             
	KNOWNISSUES("KNOW ISSUES"),           
	ROLE("ROLE"),
	FEES("FEES"),
	FEESEXP("FEES EXP");

	
private String param;
	
	private static Map<String,JuniorPlayerParameters> paraMap = new HashMap<String,JuniorPlayerParameters>(); //hashmap to pass 
	
	static {
		for(JuniorPlayerParameters param: JuniorPlayerParameters.values()) { //populate hashmap
			paraMap.put(param.getParamStr(),param);
		}//for loop
	}//static
	
	
	JuniorPlayerParameters(String param) { //inizialize param variable
		this.param = param;
	}//JuniorPlayerParameters
	
	
	public String getParamStr() { 
		return this.param;
	}//getParmaStr
	
	public static JuniorPlayerParameters getParam(String param) {

		return paraMap.get(param);
		
	}//getParam
	
}//JuniorPlayerParameters
