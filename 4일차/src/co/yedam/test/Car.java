package co.yedam.test;

/*자동차 정보 
 * Car[]
 * */
//1. 클래스선언
public class Car {
	//필드(상태, 속성, 정보..)
	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	//생성자
	/*
	 * 1. 객체생성시에 호출되었던 필드 초기화하는 특수용도의 메서드
	 * 2. 생성자 이름은 클래스명과 동일
	 * 3. 리턴타입 없음
	 * 4. 생성자 여러개 중복선언(오버로딩)은 가능하지만
	 *	  매개변수의 타입과 개수는 달라야함. (여러 생성자 중에 뭘 불러야할지 모르기 때문에)
	 */
	Car(String com, String md, String cl){
		this.company = company;
		this.model = model;
		this.color = color;
	}
	
	public Car(String model, int speed) {
		this("", model, "", 0, speed);	//다른 생성자 불러낼 때
	}
	

	Car() {
		this("현대","그렌져","검정",350,0);
	}
	
	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ ", speed=" + speed + "]";
	}

	public Car(String company, String model, String color, int maxSpeed, int speed) {
		super();
		this.company=company;
		this.model=model;
		this.color=color;
		if(maxSpeed>100) {
			this.maxSpeed = maxSpeed;
		} else {
			this.maxSpeed = 0;
		}
		if(speed>0) {
			this.speed = speed;
		} else {
			this.speed=50;
		}
		}

}
