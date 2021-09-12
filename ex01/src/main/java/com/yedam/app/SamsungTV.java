package com.yedam.app;

public class SamsungTV implements TV{

	public void turnon() {
		System.out.println("SamsungTV turnon");
	}

	public void turnoff() {
		System.out.println("SamsungTV turnoff");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		
	}
}
