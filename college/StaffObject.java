package gu_test2;

public class StaffObject { //declare variables
	
	int SFU_number;
	String name;
	String surname;
	String age;
	String dateOfBirth;
	String telNumber;
	String mobileNumber;
	String email;
	String houseNumber;
	String address;
	String postCode;
	String fees;
	String feesExp;
	
	
	public StaffObject() {//void constructor
		
	}
	
	public StaffObject(int SFU_number, String name,String surname, String age, String dateOfBirth,
	String telNumber, String mobileNumber, String email, String houseNumber, String address, String postCode, String fees, String feesExp) 
	{//initialise variables
	
		this.SFU_number = SFU_number;
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

	public void setPostCode(String postcode) {
		this.postCode = postcode;
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
		
		System.out.printf("%12.3s %19.20s %21.20s %12.3s %18.15s %15.15s %18.15s %30.30s %12.8s %34.30s %14.8s\n", getSFU_number(),getName(),getSurname(),
				getAge(),getDateOfBirth(),getTelNumber(),getMobileNumber(),getEmail(),
				getHouseNumber(),getAddress(),getPostCode(),"\n");
	}
	
		
	public StaffObject editStaffObj(StaffObject newstaffobj,String staffParameter, String editValue) {
		
		StaffParameters staffPam = StaffParameters.getParam(staffParameter);
		
		switch(staffPam) {
		
		case SFUNUM:
			newstaffobj.setSFU_number(Integer.parseInt(editValue));
			break;
		case NAME:
			newstaffobj.setName(editValue);
			break;
		case AGE:
			newstaffobj.setAge(editValue);
			break;
		case DOB:
			newstaffobj.setDateOfBirth(editValue);
			break;
		case SURNAME:
			newstaffobj.setSurname(editValue);
			break;
		case ADDRESS:
			newstaffobj.setAddress(editValue);
			break;
		case EMAIL:
			newstaffobj.setEmail(editValue);
			break;
		case TELNUMBER:
			newstaffobj.setTelNumber(editValue);
			break;
		case MOBILENUMBER:
			newstaffobj.setMobileNumber(editValue);
			break;
		case HOUSENUMBER:
			newstaffobj.setHouseNumber(editValue);
			break;
		case POSTCODE:
			newstaffobj.setPostCode(editValue);
			break;
		case FEES:
			newstaffobj.setPostCode(editValue);
			break;
		case FEESEXP:
			newstaffobj.setPostCode(editValue);
			break;
			default:
			break;
		}//switch case
		return newstaffobj;
	}//method
	
}//StaffObject class
