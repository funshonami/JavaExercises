
public class Addition {
	private int firstOperand;
	private int secondOperand;
	
	public Addition(int x, int y) {
		firstOperand = x;
		secondOperand = y;
	}
	public int getFirstOperand() {
		return firstOperand;
	}
	public void setFirstOperand(int firstOperand) {
		this.firstOperand = firstOperand;
	}
	public int getSecondOperand() {
		return secondOperand;
	}
	public void setSecondOperand(int secondOperand) {
		this.secondOperand = secondOperand;
	}
	
	public int add() { //METHOD
		int sum = firstOperand + secondOperand;
		return sum;
		
	}

}
