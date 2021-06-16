package Book;

public interface UserAccess {
		public boolean join(User user);				// 회원가입		
		public int login(String id, String pwd);			// 로그인	(1:로그인 성공 0: 비밀번호 오류 -1: 아이디 없음)		
		public boolean logOut();			// 로그아웃		
		public String userSearch(String birth); 		// 회원 검색		
		public boolean userUpdate(User user); 		// 회원정보 수정	
		public boolean userDelete(String id, String pwd);// 회원탈퇴, 삭제

	}