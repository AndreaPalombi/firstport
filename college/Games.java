package gu_test2;

public class Games { //declare variables

	String dateOfMatch;
	String location;
	String opposition;
	String koTime;
	String result;
	String finalScore;
	String firstHalfScore;
	String secondHalfScore;
	String comments;
	
	
	public Games() {
		
	}//void constructor

	
	public Games(String dateOfMatch, String location, String opposition, String koTime, String result, String finalScore, String firstHalfScore, 
			String secondHalfScore, String comments) { //initialise variables
		
		this.dateOfMatch = dateOfMatch;
		this.location = location;
		this.opposition = opposition;
		this.koTime = koTime;
		this.result = result;
		this.finalScore = finalScore;
		this.firstHalfScore = firstHalfScore;
		this.secondHalfScore = secondHalfScore;
		this.comments = comments;
	}


	public String getDateOfMatch() {
		return dateOfMatch;
	}

	public void setDateOfMatch(String dateOfMatch) {
		this.dateOfMatch = dateOfMatch;
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOpposition() {
		return opposition;
	}

	public void setOpposition(String opposition) {
		this.opposition = opposition;
	}

	public String getKoTime() {
		return koTime;
	}

	public void setKoTime(String koTime) {
		this.koTime = koTime;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(String score) {
		this.finalScore = score;
	}

	public String getFirstHalfScore() {
		return firstHalfScore;
	}

	public void setFirstHalfScore(String firstHalfScore) {
		this.firstHalfScore = firstHalfScore;
	}

	public String getSecondHalfScore() {
		return secondHalfScore;
	}

	public void setSecondHalfScore(String secondHalfScore) {
		this.secondHalfScore = secondHalfScore;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	

public Games editGames(Games newGamesobj, String gamesParameter, String editValue) {
	
		GamesParameters gamesParam = GamesParameters.getParam(gamesParameter);
		switch(gamesParam) {
		case DATE: 
			newGamesobj.setDateOfMatch(editValue);
			break;
		case LOCATION:
			newGamesobj.setLocation(editValue);
			break;
		case OPPOSITION:
			newGamesobj.setOpposition(editValue);
			break;
		case KICKOFF:
			newGamesobj.setKoTime(editValue);
			break;
		case RESULT:
			newGamesobj.setResult(editValue);
			break;
		case FIRSTHALF:
			newGamesobj.setFirstHalfScore(editValue);
			break;
		case SECONDHALF:
			newGamesobj.setSecondHalfScore(editValue);
			break;
		case FINAL:
			newGamesobj.setFinalScore(editValue);
			break;
		case COMMENTS:
			newGamesobj.setComments(editValue);
			break;
		default:
		break;
		}//switch case
		return newGamesobj;
	}//editGames

}//Games class
