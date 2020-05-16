package gu_test2;

public class JuniorPlayersObject { //declare variables
	
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
	String doctorName;
	String doctorTel;
	String knownIssues;
	String[]rolePlayed = {"Goalkeeper", "Full Back", "Centre Back", "Midfielder", "Wing", "Forward", "Striker"};
	String role;
	String guardianName;
	String guardianAddress;
	String guardianHouseNumber;
	String guardianName2;
	String guardianAddress2;
	String guardianHouseNumber2;
	String guardianPostCode2;
	String guardianPostCode;
	String relationship;
	String relationship2;
	String guardianTel;
	String guardianTel2;
	String fees;
	String feesExp;
	
	public JuniorPlayersObject() {	//void constructor
		
	}
	
	
	public JuniorPlayersObject(int sFU_number, String name, String surname, String age, String dateOfBirth, String telNumber, String mobileNumber,
			String email,String houseNumber,String address, String postCode, String guardianName, String guardianHouseNumber, String guardianAddress,
			String guardianPostCode, String guardianTel, String relationship, String guardianName2, String guardianHouseNumber2, String guardianAddress2,
		    String guardianPostCode2, String guardianTel2, String relationship2,String doctorName, String doctorTel, String knownIssues, String role,
		    String fees, String feesExp) 
	{
			
		this.SFU_number = sFU_number;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.telNumber = telNumber;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.houseNumber = houseNumber;
		this.address = address;
		this.postCode = postCode;
		this.guardianName = guardianName;
		this.guardianHouseNumber = guardianHouseNumber;
		this.guardianAddress = guardianAddress;
		this.guardianPostCode = guardianPostCode;
		this.guardianTel = guardianTel;
		this.relationship = relationship;
		this.guardianName2 = guardianName2;
		this.guardianHouseNumber2 = guardianHouseNumber2;
		this.guardianAddress2 = guardianAddress2;
		this.guardianPostCode2 = guardianPostCode2;
		this.guardianTel2 = guardianTel2;
		this.relationship2 = relationship2;
		this.doctorName = doctorName;
		this.doctorTel = doctorTel;
		this.knownIssues = knownIssues;
		this.role = role;
		this.fees = fees;
		this.feesExp = feesExp;
	}
	
	
	//=====SETTERS AND GETTERS====//
	
	
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
	
	public String getGuardianName() {
		return guardianName;
	}
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}
	
	public String getGuardianHouseNumber() {
		return guardianHouseNumber;
	}
	public void setGuardianHouseNumber(String guardianHouseNumber) {
		this.guardianHouseNumber = guardianHouseNumber;
	}
	
	public String getGuardianAddress() {
		return guardianAddress;
	}
	
	public void setGuardianAddress(String guardianAddress) {
		this.guardianAddress = guardianAddress;
	}
	
	public String getGuardianPostCode() {
		return guardianPostCode;
	}
	
	public void setGuardianPostCode(String guardianPostCode) {
		this.guardianPostCode = guardianPostCode;
	}
	
	public String getGuardianTel() {
		return guardianTel;
	}
	public void setGuardianTel(String guardianTel) {
		this.guardianTel = guardianTel;
	}
	
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	
	public String getGuardianName2() {
		return guardianName2;
	}
	public void setGuardianName2(String guardianName2) {
		this.guardianName2 = guardianName2;
	}
	public String getGuardianHouseNumber2() {
		return guardianHouseNumber2;
	}
	public void setGuardianHouseNumber2(String guardianHouseNumber2) {
		this.guardianHouseNumber2 = guardianHouseNumber2;
	}
	
	public String getGuardianAddress2() {
		return guardianAddress2;
	}
	public void setGuardianAddress2(String guardianAddress2) {
		this.guardianAddress2 = guardianAddress2;
	}
	
	public String getGuardianPostCode2() {
		return guardianPostCode2;
	}
	public void setGuardianPostCode2(String guardianPostCode2) {
		this.guardianPostCode2 = guardianPostCode2;
	}
	
	public String getGuardianTel2() {
		return guardianTel2;
	}
	
	public void setGuardianTel2(String guardianTel2) {
		this.guardianTel2 = guardianTel2;
	}
	
	public String getRelationship2() {
		return relationship2;
	}
	public void setRelationship2(String relationship2) {
		this.relationship2 = relationship2;
	}
	
	public String getDoctorName() {
		return doctorName;
	}
	
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
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
		
		System.out.printf("%12.6s %19.20s %21.20s %12.3s %18.10s %15.11s %18.11s %30.30s %12.6s %34.30s %15.11s %30.22s %26.11s %34.22s %25.11s %17.21s "
				+ "%20.10s %24.20s %25s %34.29s %22.10s %21.11s %22.21s %26.10s %21.20s %23.20s %14.11s\n", getSFU_number(),getName(),getSurname(),getAge(),
				getDateOfBirth(),getTelNumber(),getMobileNumber(),getEmail(),getHouseNumber(),getAddress(),getPostCode(),getGuardianName(),
				getGuardianHouseNumber(),getGuardianAddress(),getGuardianPostCode(),getGuardianTel(),getRelationship(),getGuardianName2(),
				getGuardianHouseNumber2(),getGuardianAddress2(),getGuardianPostCode2(),getGuardianTel2(),getRelationship2(),getDoctorName(),getDoctorTel(),
				getKnownIssues(),getRole());
	}//display data method
	
	
	
public JuniorPlayersObject editJuniorPlayerObj(JuniorPlayersObject newjuniorPlayerobj,String juniorPlayerParameter, String editValue) {
		
		JuniorPlayerParameters juniorPlayerPam = JuniorPlayerParameters.getParam(juniorPlayerParameter);
		
		switch(juniorPlayerPam) {
		
		case SFUNUM:
			newjuniorPlayerobj.setSFU_number(Integer.parseInt(editValue));
			break;
		case ADDRESS:
			newjuniorPlayerobj.setAddress(editValue);
			break;
		case AGE:
			newjuniorPlayerobj.setAge(editValue);
			break;
		case DOB:
			newjuniorPlayerobj.setDateOfBirth(editValue);
			break;
		case DOCTORNAME:
			newjuniorPlayerobj.setDoctorName(editValue);
			break;
		case DOCTORNUMBER:
			newjuniorPlayerobj.setDoctorTel(editValue);
			break;
		case EMAIL:
			newjuniorPlayerobj.setEmail(editValue);
			break;
		case HOUSEN:
			newjuniorPlayerobj.setHouseNumber(editValue);
			break;
		case KNOWNISSUES:
			newjuniorPlayerobj.setKnownIssues(editValue);
			break;
		case MOBILENUMBER:
			newjuniorPlayerobj.setMobileNumber(editValue);
			break;
		case NAME:
			newjuniorPlayerobj.setName(editValue);
			break;
		case GUARDNAME:
			newjuniorPlayerobj.setGuardianName(editValue);
			break;
		case GUARDHOUSEN:
			newjuniorPlayerobj.setGuardianHouseNumber(editValue);
			break;
		case POSTCODE:
			newjuniorPlayerobj.setPostCode(editValue);
			break;
		case ROLE:
			newjuniorPlayerobj.setRole(editValue);
			break;
		case SURNAME:
			newjuniorPlayerobj.setSurname(editValue);
			break;
		case TELNUMBER:
			newjuniorPlayerobj.setTelNumber(editValue);
			break;
		case GUARDADD:
			newjuniorPlayerobj.setGuardianAddress(editValue);
			break;
		case GUARDIANPOST:
			newjuniorPlayerobj.setGuardianPostCode(editValue);
			break;
		case GUARDIANTEL:
			newjuniorPlayerobj.setGuardianTel(editValue);
			break;
		case GUARDRELAT:
			newjuniorPlayerobj.setRelationship(editValue);
			break;
		case SECGUARDNAME:
			newjuniorPlayerobj.setGuardianName(editValue);
			break;
		case SECGUARDHOUSNUM:
			newjuniorPlayerobj.setGuardianHouseNumber2(editValue);
			break;
		case SECGUARDADD:
			newjuniorPlayerobj.setGuardianAddress2(editValue);
			break;
		case SECGUARDPOST:
			newjuniorPlayerobj.setGuardianPostCode2(editValue);
			break;
		case SECGUARDTEL:
			newjuniorPlayerobj.setGuardianTel2(editValue);
			break;
		case SECGUARDREL:
			newjuniorPlayerobj.setRelationship2(editValue);
			break;
		case FEES:
			newjuniorPlayerobj.setFees(editValue);
			break;
		case FEESEXP:
			newjuniorPlayerobj.setFeesExp(editValue);
			break;
		default:
			break;
		}//case
		
		return newjuniorPlayerobj;
		
	}//editPlayerObj

	
}//JuniorPlayersObject class
