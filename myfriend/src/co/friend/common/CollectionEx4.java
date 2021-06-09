package co.friend.common;

import java.util.HashMap;
import java.util.Map;

import co.friend.access.FriendDAO;

public class CollectionEx4 {
	public static void main(String[] args) {
		// 이름, 연락처 출력하세요.
		FriendDAO dao = new FriendDAO();
		System.out.println(dao.getNameTel());
	}
}
