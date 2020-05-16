package gu_test2;

import java.util.HashMap;
import java.util.Map;

public enum SeniorPlayerParameters { //declare parameters

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
	NEXTofKINNAME("NEXT OF KIN NAME"),     
	NEXTofKINNUM("NEXT OF KIN NUMBER"),              
	DOCTORNAME("DOCTOR NAME"),     
	DOCTORNUMBER("DOCTOR NUMBER"),             
	KNOWNISSUES("KNOW ISSUES"),           
	ROLE("ROLE"),
	FEES("FEES"),
	FEESEXP("FEES EXP");
	
	private String param;
	
	private static Map<String,SeniorPlayerParameters> paraMap = new HashMap<String,SeniorPlayerParameters>(); //hashmap to pass 
	
	static {
		for(SeniorPlayerParameters param: SeniorPlayerParameters.values()) { //populate hashmap
			paraMap.put(param.getParamStr(),param);
		}
	}
	
	
	SeniorPlayerParameters(String param) { //inizialise param variable
		this.param = param;
	}//PlayerParameters
	
	
	public String getParamStr() { 
		return this.param;
	}//getParamStr
	
	public static SeniorPlayerParameters getParam(String param) {

		return paraMap.get(param);
		
	}//getParam
	
	
}//SeniorPlayerParameters
