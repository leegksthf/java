package co.yedam.emp;

import java.util.Scanner;

public class EmployeeApp {
	Scanner scanner = new Scanner(System.in);
	Member[] members = new Member[10];		//??
	int cnt = 0;
	int memberNum;
	
	void init() {
		System.out.println("�����:");
		int MemberNum = scanner.nextInt();
	}
	//������� �Է�
	void input(int num, String name, int salary) {
		members[cnt++] = new Member(num, name, salary);
	}
	
	void input() {
		System.out.println("��� �Է�:");
		int num = scanner.nextInt();
		System.out.println("�̸� �Է�:");
		String name = scanner.next();
		System.out.println("�޿� �Է�");
		int salary = scanner.nextInt();
		members[cnt++] = new Member(num, name, salary);
	}
	//member list �������Ʈ
	void print() {
		for (int i=0;i<cnt;i++) {
			System.out.println(members[i]);
		}
	}
	//�˻�
	/*void printMember(int num) {
		System.out.println("�˻��� ���:");
		String name = scan.next();
		
		members[cnt++] = new Member(num, name);	
	}*/
	
	//�޿��հ�
	void sum() {
		int sum = 0;
		for (int i=0;i<cnt;i++) {
			sum += members[i].salary;
		}
	}
}

