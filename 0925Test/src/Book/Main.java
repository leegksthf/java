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
					} while (bookMenuNumber != 7);

					break;
				case 2:
					userView.userUpdate();
					break;
				case 3:
					boolean result = userView.userDelete();
					if (result)
						isLogin = false;
					break;
				case 4:
					userView.userSearchName();
					break;
				}
			}
		}
	}
}