package co.friend.common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import co.friend.access.FriendAccess;
import co.friend.access.FriendDAO;
import co.friend.model.Friend;

//568~570페이지 => 논리적으로 동일한
//객체정의: hashCode, equals 메소드정의.
public class CollectionEx2 {
	public static void main(String[] args) {
		
		System.out.println("Hello".hashCode());
		System.out.println("Hello".hashCode());
		System.out.println("n".hashCode());
		
		Set<Friend> set = new HashSet<>();
		FriendAccess dao = new FriendDAO();		//= FriendDAO dao = new FriendDAO();
		
		ArrayList<Friend> list = dao.selectAll();
		for(int i=0; i<list.size(); i++) {
			set.add(list.get(i)); //중복을 제거하는 set 값을 담는다.
			System.out.println(list.get(i));			//중복값허용
		}
		System.out.println("<set>");
		for(Friend friend : set) {
			System.out.println(friend.toString());
		}
		
	}
}
