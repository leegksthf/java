package co.micol.tv;

public class LgTV implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("LG TV-전원 on");
	}

	@Override
	public void powerOff() {
		System.out.println("LG TV-전원 off");
	}

	@Override
	public void volumeUp() {
		System.out.println("LG TV-볼륨 up");
	}

	@Override
	public void volumeDown() {
		System.out.println("LG TV-볼륨 down");
		
	}
	
	

}
