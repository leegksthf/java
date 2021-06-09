package 열거타입;

public class 동기화 {
	
	public static void main(String[] args) {
	
		//공유객체
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);	//100
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);	//50
		
		user1.start();
		user2.start();
		
	}
}
