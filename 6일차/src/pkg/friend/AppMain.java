package pkg.friend;

import pkg.Friend;

public class AppMain {
	public static void main(String[] args) {
		Friend f = new CompanyFriend("학교","홍길동","1111","과장");
		f.print();
		
		Friend f1 = new SchoolFriend("학교","홍길동","2222","1011");
		f1.print();
		//다형성 (상속받고 오버라이딩이 전제조건)
		//1. 부모타입의 참조변수가 자식객체를 참조가능
		//2. 메서드 실행하면 참조대상의 메서드가 호출되므로 결과가 다르다.
		FriendManager manager = new FriendManager();//BeanFactory.getBean(FriendAccess.class);
			//new FriendManager();//new FriendList();
		for(Friend fr :manager.friends) {
			fr.print();
			//if(fr instanceof CompanyFriend)
			//    fr.print(); ---->회사친구만 출력
			//if(fr instanceof SchoolFriend)
				//fr.print(); ---->학교친구만 출력
		}
}
}
