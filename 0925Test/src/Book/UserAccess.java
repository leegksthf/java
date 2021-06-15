package Book;

public interface UserAccess {
		public void join();				// 회원가입		
		public void logIn();			// 로그인			
		public void logOut();			// 로그아웃		
		public void userSearch(); 		// 회원 검색		
		public void printUserList();	// 회원리스트 출력	
		public void userUpdate(); 		// 회원정보 수정	
		public void userDelete(); 		// 회원탈퇴, 삭제	

	}