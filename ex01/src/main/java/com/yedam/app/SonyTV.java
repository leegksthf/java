package com.yedam.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SonyTV implements TV {
	
	@Autowired Speaker speaker;
	
	@Override														//오버라이드는 있어도 없어도 됨
	public void turnon() {
		System.out.println("SonyTV turnon");
	}
	@Override
	public void turnoff() {
		System.out.println("SonyTV turnoff");
	}
	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}
	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}
}
