package pkg.friend;

import pkg.Friend;

public class CompanyFriend extends Friend {
	String duty;

	public CompanyFriend() {}
	
	public CompanyFriend(String gubun, String name, String tel) {
		super(gubun, name, tel);
	}

	public CompanyFriend(String gubun, String name, String tel, String duty) {
		super(gubun, name, tel);
		this.duty = duty;
	}

	@Override
	public void print() {					//overide시 타입, 매개변수 같아야함
		//super.print();
		//System.out.println("duty:" + duty);			//company~에 print 없다면 부모클래스인 friend의 print가 실행됨
		System.out.printf("회사친구: %20s %20s %20s %20s\n", gubun, name, tel, duty);
	}
}
