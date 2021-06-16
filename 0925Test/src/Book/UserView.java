package Book;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class UserView {
	Scanner scanner = new Scanner(System.in);
	UserAccess userDao = new UserDAO();

	public void userJoin() {
		System.out.println("\n회원 가입");
		User user = new User();

		System.out.print("아이디를 입력하세요. > ");
		user.setName(scanner.nextLine());

		System.out.print("패스워드를 입력하세요. > ");
		user.setPwd(scanner.nextLine());

		System.out.print("생년월일을 입력하세요. > ");
		user.setBirth(scanner.nextLine());

		System.out.print("휴대폰번호를 입력하세요. > ");
		user.setPhone(scanner.nextLine());

		boolean joinResult = userDao.join(user);
		if (joinResult) {
			System.out.println("회원 가입을 축하합니다. 로그인 하세요\n");
		} else {
			System.out.println("회원 가입에 실패했습니다. 다시 시도해주세여.\n");
		}
	}

	public boolean userLogin() {
		System.out.println("\n회원 로그인");
		String name, pwd;

		System.out.print("아이디를 입력하세요. > ");
		name = scanner.nextLine();

		System.out.print("패스워드를 입력하세요. > ");
		pwd = scanner.nextLine();

		int loginResult = userDao.login(name, pwd);

		if (loginResult == 1) {
			System.out.println("로그인 되었습니다.\n");
			return true;
		} else if (loginResult == 0 || loginResult == -1) {
			System.out.println("아이디 또는 패스워드가 일치하지 않습니다.\n");
		} else {
			System.out.println("데이터베이스 오류. 잠시후 다시 시도해주세요.\n");
		}
		return false;
	}

	public void userSearchName() {
		System.out.println("\n아이디 찾기");
		String birth;

		System.out.print("생년월일을 입력하세요.(ex. 20200101) > ");
		birth = scanner.nextLine();

		String result = userDao.userSearch(birth);

		if (!result.equals("")) {
			System.out.println("찾으시는 아이디는'" + result + "'입니다.");
		} else {
			System.out.println("아이디를 찾을 수 없습니다.");
		}
	}

	public void userUpdate() {
		String name, pwd;

		System.out.print("아이디를 입력하세요. > ");
		name = scanner.nextLine();

		System.out.print("패스워드를 입력하세요. > ");
		pwd = scanner.nextLine();

		int loginResult = userDao.login(name, pwd);

		if (loginResult == 1) {
			User user = new User();

			user.setName(name);

			System.out.print("변경할 패스워드를 입력하세요. > ");
			user.setPwd(scanner.nextLine());

			System.out.print("변경할 생년월일을 입력하세요. > ");
			user.setBirth(scanner.nextLine());

			System.out.print("변경할 휴대폰번호를 입력하세요. > ");
			user.setPhone(scanner.nextLine());

			boolean updateResult = userDao.userUpdate(user);

			if (updateResult) {
				System.out.println("회원정보가 성공적으로 변경되었습니다.");
			} else {
				System.out.println("회원정보 변경에 실패했습니다.");
			}
		} else if (loginResult == 0 || loginResult == -1) {
			System.out.println("아이디 또는 패스워드가 일치하지 않습니다.\n");
		} else {
			System.out.println("데이터베이스 오류. 잠시후 다시 시도해주세요.\n");
		}
	}

	public void userDelete() {
		System.out.println("\n회원탈퇴");
		String name, pwd;

		System.out.print("아이디를 입력하세요. > ");
		name = scanner.nextLine();

		System.out.print("패스워드를 입력하세요. > ");
		pwd = scanner.nextLine();

		boolean deleteResult = userDao.userDelete(name, pwd);

		if (deleteResult) {
			System.out.println("회원탈퇴 되었습니다.\n");
		} else {
			System.out.println("회원탈퇴에 실패했습니다.\n");
		}
	}
}
