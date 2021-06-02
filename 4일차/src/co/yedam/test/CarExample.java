package co.yedam.test;

public class CarExample {

	public static void main(String[] args) {
		//객체생성(인스턴스)
		Car/*클래스이름*/ myCar/*변수*/ = new Car();
		myCar.company="삼성자동차";
		myCar.maxSpeed=400;
		myCar.color="레드";
		System.out.println("제작회사:" + myCar.company);
		System.out.println("스피드:" + myCar.speed);

		//생성자
		Car youCar = new Car("기아","SM6","블루");
		System.out.println(youCar);
		
		Car miniCar = new Car("코나",100);
		System.out.println(miniCar);
	}

}
