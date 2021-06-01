package co.micol.fly;
//인터페이스
//1. 다중상속
//2. public abstract 생략 모든 메서드 추상메서드
//3. 개발표준
public interface Flyer {
	
	public abstract void takeOff();	//이륙
	void fly();			//비행
	void land();		//착륙
}