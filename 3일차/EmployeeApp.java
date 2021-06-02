package co.yedam.emp;

import java.util.Scanner;

public class EmployeeApp {
	Scanner scanner = new Scanner(System.in);
	Member[] members = new Member[10];		//??
	int cnt = 0;
	int memberNum;
	
	void init() {
		System.out.println("사원수:");
		int MemberNum = scanner.nextInt();
	}
	//사원정보 입력
	void input(int num, String name, int salary) {
		members[cnt++] = new Member(num, name, salary);
	}
	
	void input() {
		System.out.println("사번 입력:");
		int num = scanner.nextInt();
		System.out.println("이름 입력:");
		String name = scanner.next();
		System.out.println("급여 입력");
		int salary = scanner.nextInt();
		members[cnt++] = new Member(num, name, salary);
	}
	//member list 사원리스트
	void print() {
		for (int i=0;i<cnt;i++) {
			System.out.println(members[i]);
		}
	}
	//검색
	/*void printMember(int num) {
		System.out.println("검색할 사번:");
		String name = scan.next();
		
		members[cnt++] = new Member(num, name);	
	}*/
	
	//급여합계
	void sum() {
		int sum = 0;
		for (int i=0;i<cnt;i++) {
			sum += members[i].salary;
		}
	}
}

