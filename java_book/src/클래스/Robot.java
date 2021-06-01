package 클래스;

//1. 클래스 선언
public class Robot {

	// 필드
	// private(클래스 내부에서만 접근가능) : 접근제어자
	private int arm;
	private int leg;
	private String name;

	// 생성자 오버로딩
	public Robot(int arm, int leg, String name) {
		this.arm = arm; // this는 자기자신 객체를 참조하는 참조변수
		this.leg = leg;
		this.name = name;
	}

	// 기본생성자
	// public Robot() {} //컴파일러가 만들어주는 기본 생성자
	public Robot(int arm, int leg) {
		this.arm = arm; // this는 자기자신 객체를 참조하는 참조변수
		this.leg = leg; // 매개변수가 있는 생성자 만들거면 기본 생성자도 만들어줘야함
	}

	// setter: 필드값을 변경
	public void setArm(int arm) {
		this.arm = arm;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	//getter: 필드값을 조회
	public int getArm() {
		return this.arm;
	}

	public int getLeg() {
		return this.leg;
	}

	public String getName() {
		return this.name;
	}
	
	// 일반메서드
	public void print() {
		System.out.printf("arm :%d leg :%d", arm, leg);
	}

}
