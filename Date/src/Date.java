
public class Date {
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
		if (day > 0 && day < 32) {
			this.day = day;
		}
		if (day < 0 || day > 31) {
			System.out.println("Date entered is invalid");
			System.exit(0);
		}
		
		
		if (month < 13 && month > 0) {
			this.month = month;
		}
		if (month < 1 || month > 12) {
			System.out.println("Month entered is invalid");
			System.exit(0);
		}
		
		
		if (year < 1 || year > 9999) {
			System.out.println("Year entered is invalid");
			System.exit(0);
		}
		if (year <= 9999 && year > 0) {

			this.year = year;
		}

	}

	public void setDay(int day) {
		if (day > 0 && day < 32) {
			this.day = day;
		}
		if (day < 0 || day > 31) {
			System.out.println("Date entered is invalid");
			System.exit(0);
		}
	}

	public int getDay() {
		return day;
	}

	public void setmonth(int month) {
		if (month < 13 && month > 0) {
			this.month = month;
		}
		if (month < 1 || month > 12) {
			System.out.println("Month entered is invalid");
			System.exit(0);
		}
	}

	public int getMonth() {
		return month;
	}

	public void setYear(int year) {
		if (year < 1 || year > 9999) {
			System.out.println("Year entered is invalid");
			System.exit(0);
		}
		if (year <= 9999 && year > 0) {

			this.year = year;
		}
	}

	public int getYear() {
		return year;
	}

	public void displayDate() {
		System.out.printf("Todays date is: %d/ %d/ %d", day, month, year);
	}
}
