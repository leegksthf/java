package Book;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserView userView = new UserView();
		BookView bookView = new BookView();
		boolean isLogin = false;
		int menuNumber = 0;

		while (true) {
			if (!isLogin) { // 로그인이 되지 않은 경우
				do {
					System.out.print("1.로그인 2.회원가입 3.아이디 찾기 4.종료 > ");
					menuNumber = sc.nextInt();
				} while (menuNumber < 1 || menuNumber > 4);

				if (menuNumber == 4)
					break;

				switch (menuNumber) {
				case 1:
					boolean loginResult = userView.userLogin();
					if (loginResult)
						isLogin = true;
					break;
				case 2:
					userView.userJoin();
					break;
				case 3:
					userView.userSearchName();
					break;
				}
			} else {
				do {
					System.out.print("1.도서관리 2.회원정보수정 3.탈퇴하기 4.로그아웃 5.종료 > ");
					menuNumber = sc.nextInt();
				} while (menuNumber < 1 || menuNumber > 5);
				if (menuNumber == 5)
					break;

				switch (menuNumber) {
				case 1:
					int bookMenuNumber = 0;

					do {
						System.out.print("1.책 리스트 2.책 등록 3.책 정보수정 4.책 삭제 5.책 대여 6. 책 반납 7.종료 > ");
						bookMenuNumber = sc.nextInt();

						switch (bookMenuNumber) {
						case 1:
							bookView.viewAllBooks();
							break;
						case 2:
							bookView.insertBook();
							break;
						case 3:
							bookView.updateBook();
							break;
						case 4:
							bookView.deleteBook();
							break;
						case 5:
							bookView.borrowBook();
							break;
						case 6:
							bookView.backBook();
							break;
							
						}
					} while (bookMenuNumber != 4);

					break;
				case 2:
					userView.userUpdate();
					break;
				case 3:
					userView.userDelete();
					break;
				case 4:
					userView.userSearchName();
					break;
				}
			}
		}
//				
//			} else if(user.loginMember().getId() == "admin" ) { 		//로그인 한 경우
//				
//				do {
//				System.out.print("1.도서 관리 2.회원관리 3.로그아웃 4.종료 > ");
//				ch = sc.nextInt();
//				} while (ch<1||ch>4);
//				
//				if(ch==4) break;
//				
//				switch (ch) {
//					case 1: do {
//							System.out.print("1.도서등록 2.도서수정 3.도서삭제 4.도서검색 5.도서리스트 6.복귀 ");
//							ch = sc.nextInt();
//							} while(ch<1||ch>6);
//					
//							if(ch==6) break;
//					
//							switch (ch) {
//							
//							case 1:book.insert(); break; 					// 도서 등록 
//							case 2:book.update(); break;				// 도서 수정
//							case 3:book.delete(); break;				// 도서 삭제
//							case 4:book.bookSearch(); break;				// 도서명검색
//							case 5:book.selectAll(); break;				// 도서리스트
//							}break;
//					case 2: do {
//								System.out.print("1.회원 리스트 2.이름검색 3.회원삭제 4.복귀 ");
//								ch = sc.nextInt();
//							} while(ch<1||ch>4);
//							
//							if(ch==4) break;
//				
//							switch (ch) {
//							case 1: user.UserList();break;		// 회원리스트
//							case 2: user.userSearch();break;		// 아이디검색
//							case 3: user.userDelete();break;		// 유저 삭제
//							}
//							break;
//					case 3:user.logOut(); break;					//로그아웃
//				}
//			}
//			
//			// 일반 사용자로 로그인한 경우
//			else{
//				
//				do {
//					System.out.print("1.도서 대여 2.도서반납 3.도서검색 4.로그아웃 5.정보수정 6.탈퇴 7.종료");
//					ch = sc.nextInt();
//				} while (ch < 1 || ch > 7);
//				
//				if (ch == 7)
//					break;
//		
//				switch (ch) {
//					case 1:
//						book.borrow();
//						break; 						// 도서 대여
//					case 2:
//						book.back();
//						break; 						// 도서 반납
//					case 3:
//						book.bookSearch();
//						break; 						// 도서 검색
//					case 4:
//						user.logOut();				// 로그아웃
//						break;
//					case 5: 
//						user.userUpdate();			// 정보 수정
//					case 6: 
//						user.userDelete();			// 탈퇴
//				}
//
//			}
//		}
	}
}