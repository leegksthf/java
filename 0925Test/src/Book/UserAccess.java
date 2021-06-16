package Book;

import java.util.ArrayList;

public interface UserAccess {
		public void join(User user);				// 회원가입		
		public int login(String id, String pwd);			// 로그인			
		public void logOut();			// 로그아웃		
		public User userSearch(String name); 		// 회원 검색		
		public ArrayList<User> UserList();	// 회원리스트 출력	
		public void userUpdate(User user); 		// 회원정보 수정	
		public void userDelete(String id, String pwd);// 회원탈퇴, 삭제
		public int userCheck(String id, String pwd);

	}