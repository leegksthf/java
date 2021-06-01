package co.micol.fly;

//다중상속 안됨. 부모클래스 하나만 가능
public class Superman extends Human implements Flyer{

	public void takeOff() {	
		System.out.println("슈퍼맨 이륙 - 손을 위로 들어올리고");
	}
	
	public void fly() {
		System.out.println("비행기 비행");
	}
	public void land() {
		System.out.println("비행기 착륙");
	}
	
}
