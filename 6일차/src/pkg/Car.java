package pkg;

public class Car {
	private String model;
	private int speed;
	private boolean stop;
	

	public Car() {}					//생성자 만들면 기본생성자도 만들어주기
	
	public Car(String model, int speed) {
		this.model = model;
		if(speed <50) {
			speed = 50;
		}
		this.speed = speed;
	}
	
	public Car(String model) {
		this(model, 0);
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isStop() {		//불린타입은 get말고 is 들어옴
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}

	
	
}


	