package co.micol.fly;

public abstract class Animal {
	
	public void run() {
		System.out.println("상위객체가 가지고 있는 행동");
	}
	
	public abstract void eat();
	
	public void sleep() {
		System.out.println("잔다.");
	}
	
}
