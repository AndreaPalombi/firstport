package gu_test2;

public class SeniorPlayersObject { //declare variables

	String name;
	String surname;
	String age;
	int SFU_number;
	String houseNumber;
	String address;
	String dateOfBirth;
	String telNumber;
	String mobileNumber;
	String postCode;
	String email;
	String nextOfKin;
	String doctorName;
	String nextOfKinTel;
	String doctorTel;
	String knownIssues;
	String[]rolePlayed = {"Goalkeeper", "Full Back", "Centre Back", "Midfielder", "Wing", "Forward", "Striker"};
	String role;
	String fees;
	String feesExp;


	
	public SeniorPlayersObject() { //void constructor
		
	}
	
	public SeniorPlayersObject(int SFU_number, String name,String surname, String age, String dateOfBirth, String telNumber, String mobileNumber, 
			String email,String houseNumber, String address, String postCode, String nextOfKin, String nextOfKinTel, String doctorName, 
			String doctorTel, String knownIssues, String role, String fees, String feesExp) { //initialise variables
	
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.SFU_number = SFU_number;
		this.dateOfBirth = dateOfBirth;
		this.telNumber = telNumber;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.houseNumber = houseNumber;
		this.address = address;
		this.postCode = postCode;
		this.nextOfKin = nextOfKin;
		this.nextOfKinTel = nextOfKinTel;
		this.doctorName = doctorName;
		this.doctorTel = doctorTel;
		this.knownIssues = knownIssues;
		this.role = role;
		this.fees = fees;
		this.feesExp = feesExp;
			
	}


	public int getSFU_number() {
		return SFU_number;
	}

	public void setSFU_number(int sFU_number) {
		SFU_number = sFU_number;
	}

		public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getNextOfKin() {
		return nextOfKin;
	}

	public void setNextOfKin(String nextOfKin) {
		this.nextOfKin = nextOfKin;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getNextOfKinTel() {
		return nextOfKinTel;
	}

	public void setNextOfKinTel(String nextOfKinTel) {
		this.nextOfKinTel = nextOfKinTel;
	}

	public String getDoctorTel() {
		return doctorTel;
	}

	public void setDoctorTel(String doctorTel) {
		this.doctorTel = doctorTel;
	}

	public String getKnownIssues() {
		return knownIssues;
	}

	public void setKnownIssues(String knownIssues) {
		this.knownIssues = knownIssues;
	}

	public String[] getRolePlayed() {
		return rolePlayed;
	}

	public void setRolePlayed(String[] rolePlayed) {
		this.rolePlayed = rolePlayed;
		
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
		
	}
	
	public String getFees() {
		return fees;
	}

	public void setFees(String fees) {
		this.fees = fees;
	}

	public String getFeesExp() {
		return feesExp;
	}

	public void setFeesExp(String feesExp) {
		this.feesExp = feesExp;
	}
	

	public void displayData() {
		
		System.out.printf("%12s %19s %21s %12s %18s %15.11s %18.11s %30.30s %12s %34.30s %15s %24.22s %17.11s %25.22s %17.11s %24.21s %14.11s\n", 
				getSFU_number(),getName(),getSurname(),getAge(),getDateOfBirth(),getTelNumber(),getMobileNumber(),getEmail(),getHouseNumber(),
				getAddress(),getPostCode(),getNextOfKin(),getNextOfKinTel(),getDoctorName(),getDoctorTel(),getKnownIssues(),getRole());
	}//displayData
	
	
	public SeniorPlayersObject editPlayerObj(SeniorPlayersObject newplayerobj,String playerParameter, String editValue) {
		
		SeniorPlayerParameters playerPam = SeniorPlayerParameters.getParam(playerParameter);
		
		switch(playerPam) {
		
		case SFUNUM:
			newplayerobj.setSFU_number(Integer.parseInt(editValue));
			break;
		case ADDRESS:
			newplayerobj.setAddress(editValue);
			break;
		case AGE:
			newplayerobj.setAge(editValue);
			break;
		case DOB:
			newplayerobj.setDateOfBirth(editValue);
			break;
		case DOCTORNAME:
			newplayerobj.setDoctorName(editValue);
			break;
		case DOCTORNUMBER:
			newplayerobj.setDoctorTel(editValue);
			break;
		case EMAIL:
			newplayerobj.setEmail(editValue);
			break;
		case HOUSEN:
			newplayerobj.setHouseNumber(editValue);
			break;
		case KNOWNISSUES:
			newplayerobj.setKnownIssues(editValue);
			break;
		case MOBILENUMBER:
			newplayerobj.setMobileNumber(editValue);
			break;
		case NAME:
			newplayerobj.setName(editValue);
			break;
		case NEXTofKINNAME:
			newplayerobj.setNextOfKin(editValue);
			break;
		case NEXTofKINNUM:
			newplayerobj.setNextOfKinTel(editValue);
			break;
		case POSTCODE:
			newplayerobj.setPostCode(editValue);
			break;
		case ROLE:
			newplayerobj.setRole(editValue);
			break;
		case SURNAME:
			newplayerobj.setSurname(editValue);
			break;
		case TELNUMBER:
			newplayerobj.setTelNumber(editValue);
			break;
		case FEES:
			newplayerobj.setFees(editValue);
			break;
		case FEESEXP:
			newplayerobj.setFeesExp(editValue);
			break;
		default:
			break;
		}//case
		return newplayerobj;	
	}//editPlayerObj

}//class PlayersObject
