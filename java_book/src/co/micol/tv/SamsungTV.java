package co.micol.tv;

public class SamsungTV implements RemoteControl{

	//@Override
	//public void SamsungTV() {
	//	System.out.println("SamsungTV 객체생성");	
	//}
	
	@Override
	public void powerOn() {
			System.out.println("삼성 TV-전원 on");
	}

	@Override
	public void powerOff() {
		System.out.println("삼성 TV--전원 off");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("삼성 TV--볼륨 up");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("삼성 TV--볼륨 down");
		
	}

	
}
