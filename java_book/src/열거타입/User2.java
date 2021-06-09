package 열거타입;

public class User2 extends Thread{
	private Calculator calculator;

	@Override
	public void run() {
		calculator.setMemory(50);
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
		this.setName("User2");
	}
	
	
}
