import java.util.Date;

public class Human {
	private Date dateOfBirth; //CREATION OF ATTRIBUTES
	public Date getDateOfBirth() { //METHOD OF CLASS HUMAN
		return dateOfBirth; // RETURN USED FOR GETTERS
		
	}
	Date todaysDate = new Date();

	public void setDateOfBirth(Date todaysDate) { //METHOD OF CLASS HUMAN
		this.dateOfBirth = todaysDate;
	}

	
	
	public Human () { //Constructor. ALWARYS HAS SAME NAME WITH THE CLASS
	this.dateOfBirth = todaysDate;
	
}
}