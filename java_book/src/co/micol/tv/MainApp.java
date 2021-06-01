package co.micol.tv;

public class MainApp {
	//명령행 인수
	public static void main(String[] args) {
		// SamsungTV tv = new SamsungTV();
		// LgTV tv = new LGTV();
		// 2. 다형성 : 참조하는 대상의 메서드가 호출
		// 코드는 같아도 참조대상에 따라 실행결과가 다르게 나옴
		// 1. 부모타입의 참조변수가 자식객체를 참조할 수 있다.
		RemoteControl tv = (RemoteControl)BeanFactory.getBean(args[0]);

		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}
}
