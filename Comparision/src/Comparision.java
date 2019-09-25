public class Comparision {
	private int firstNumber;
	private int secondNumber;

	public Comparision(){

	}
	public Comparision(int firstNumber){
	this.firstNumber = firstNumber;
	}
	public Comparision(int firstNumber, int secondNumber){
	this.firstNumber = firstNumber;
	this.secondNumber = secondNumber;
	}
	
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber; 
	}
	
	public int getFirstNumber() {
		return firstNumber;
	}
	public int getSecondNumebr() {
		return secondNumber;
	}
	
	public int compare(int x, int y) {
		int max = 0;
		if( x > y) {
			max = x;
		}
		else {
			max = y;
		}
		return max;
	
	}
	
	public int compareAndEqual(int x, int y) {
		int max = 0;
		if(x > y) {
			max = x;
		}
		if(y > x) {
			max = y;
		}
		else{
			x = y;
		}
		
		return max;
	
	}
	
	
	
	
}