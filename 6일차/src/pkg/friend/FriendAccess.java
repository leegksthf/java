package pkg.friend;

import java.util.List;

import pkg.Friend;
/*
 * 인터페이스 : 상수필드 + 추상메서드
 * 모든 상수필드는 public static final이 붙어있음. String model="a" = public static final String model = "a"
 * 모든 메서드는 public abstract
 */
// 친구관리 개발 시 개발 표준
public interface FriendAccess {
	/*public static final*/String model = "dd";
	
	//등록
	public void insert(Friend friend);
	//수정
	public void update(Friend friend);
	//삭제
	public void delete(String name);
	//전체조회
	public void selectAll();
	//단건조회
	public Friend selectOne(String name);
	
}
