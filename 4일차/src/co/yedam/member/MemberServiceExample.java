package co.yedam.member;

import java.util.Scanner;

public class MemberServiceExample {
	public static void main(String[] args) {

		MemberService app = new MemberService();
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		int selectNo = 0;
		
		while(run) {
			System.out.println("1.등록  2.전체조회  3.번호로조회  4.로그인  5.id로조회 6.종료");
			System.out.println("선택>");
			selectNo = scanner.nextInt();
			if(selectNo == 1) {
				app.insert();
			} else if(selectNo == 2) {
				app.printList();
			} else if(selectNo == 3) {
				app.printMember(1);
			} else if(selectNo == 4) {
				app.login();
			} else if(selectNo == 5) {
				app.id();
				//app.logout(null);
			} else if(selectNo == 6) {
				run = false;
			}
		}
		
		System.out.println("bye!!!");
	}
}










/*
 * MemberService memberService = new MemberService(); boolean result =
 * memberService.login("hong", "12345");
 * 
 * if(result) { System.out.println("로그인 되었습니다."); memberService.logout("hong");
 * } else { System.out.println("id 또는 password가 올바르지 않습니다."); } } }
 */