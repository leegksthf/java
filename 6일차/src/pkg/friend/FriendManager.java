package pkg.friend;
/*
 * 설계 : 확장성, 재사용성, 모듈 교체

친구관리
	구분(회사명, 학교명) 이름 전화번호
	회사친구:회사명, 이름, 전화번호, 직책(duty)  CompanyFriend
	학교친구:학교명, 이름, 전화번호, 생일	-> 친구분류 추가가능(확장)
	생일
	회사친구 검색
	이름검색
 */

import java.util.List;

import pkg.Friend;

public class FriendManager implements FriendAccess{
	Friend[] friends = new Friend[5];

	public FriendManager() {
		friends[0] = new CompanyFriend("예담회사", "순이", "010-2222-4444");
		friends[1] = new SchoolFriend("중앙초등", "돌이", "010-3333-4444");
		friends[2] = new SchoolFriend("중앙고등", "홍길동", "010-5555-4444");
		friends[3] = new CompanyFriend("현대", "김기자", "010-6666-4444");
		friends[4] = new CompanyFriend("현대", "김유신", "010-7777-4444");
	}
	
	@Override
	public void insert(Friend friend) {
		
	}

	@Override
	public void update(Friend friend) {
		
	}

	@Override
	public void delete(Friend friend) {
		
	}

	@Override
	public List selectAll() {
		System.out.println("FriendManager");
		return null;
	}

	@Override
	public Friend selectOne(Object key) {
		
		return null;
	}
	
}
