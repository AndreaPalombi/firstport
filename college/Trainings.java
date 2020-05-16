package gu_test2;

public class Trainings {//declare variables
	
	String coachName;
	String trainingDate;
	String trainingLocation;
	String trainingTime;
	String skillsUndertaken;
	String activities;
	String playersList;
	String injuries;
	String notes;

	public Trainings() {//void constructor
		
	}

	public Trainings(String coachName, String trainingDate, String trainingLocation, String trainingTime, String skillsUndertaken, String activities,
		String playersList, String injuries, String notes) {//initialise variables
	
	this.coachName = coachName;
	this.trainingDate = trainingDate;
	this.trainingLocation = trainingLocation;
	this.trainingTime = trainingTime;
	this.skillsUndertaken = skillsUndertaken;
	this.activities = activities;
	this.playersList = playersList;
	this.injuries = injuries;
	this.notes = notes;
	
	}
	


	public String getCoachName() {
		return coachName;
	}
	
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	
	public String getTrainingDate() {
		return trainingDate;
	}
	
	public void setTrainingDate(String trainingDate) {
		this.trainingDate = trainingDate;
	}
	
	public String getTrainingLocation() {
		return trainingLocation;
	}
	
	public void setTrainingLocation(String trainingLocation) {
		this.trainingLocation = trainingLocation;
	}
	
	public String getTrainingTime() {
		return trainingTime;
	}
	
	public void setTrainingTime(String trainingTime) {
		this.trainingTime = trainingTime;
	}
	
	public String getSkillsUndertaken() {
		return skillsUndertaken;
	}
	
	public void setSkillsUndertaken(String skillsUndertaken) {
		this.skillsUndertaken = skillsUndertaken;
	}
	
	public String getActivities() {
		return activities;
	}
	
	public void setActivities(String activities) {
		this.activities = activities;
	}
	
	public String getPlayersList() {
		return playersList;
	}
	
	public void setPlayersList(String playersList) {
		this.playersList = playersList;
	}
	
	public String getInjuries() {
		return injuries;
	}
	
	public void setInjuries(String injuries) {
		this.injuries = injuries;
	}
	
	public String getNotes() {
		return notes;
	}
	
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	public Trainings editTrainingObj(Trainings newtrainingobj,String TrainingParameter, String editValue) {
			
		TrainingParameters TrainingPam = TrainingParameters.getParam(TrainingParameter);
		
		switch(TrainingPam) {
		
		case COACH:
			newtrainingobj.setCoachName(editValue);
			break;
		case DATE:
			newtrainingobj.setTrainingDate(editValue);
			break;
		case LOCATION:
			newtrainingobj.setTrainingLocation(editValue);
			break;
		case TIME:
			newtrainingobj.setTrainingTime(editValue);
			break;
		case SKILLS:
			newtrainingobj.setSkillsUndertaken(editValue);
			break;
		case ACTIVITIES:
			newtrainingobj.setActivities(editValue);
			break;
		case PLIST:
			newtrainingobj.setPlayersList(editValue);
			break;
		case INJURIES:
			newtrainingobj.setInjuries(editValue);
			break;
		case NOTES:
			newtrainingobj.setNotes(editValue);
			break;
			default:
			break;
		}//case
		return newtrainingobj;	
	}//method
	
}//Trainings class
