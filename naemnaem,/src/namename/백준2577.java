package namename;

import java.util.Scanner;

public class ����2577 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int A = scanner.nextInt();
	int B = scanner.nextInt();
	int C = scanner.nextInt();
	int total = A*B*C;
	
	String input = String.valueOf(total);	//string���� ��ȯ. String input = Integer.toString(total)�� ��.
	
	for(int i=0; i<10; i++) {
		int count = 0;
		for(int j=0; j<input.length(); j++) {
			if((input.charAt(j) - '0')==i) {	//i��° ���ڸ� char�� ��ȯ
				count++;
			}
		}
		System.out.println(count);
	}
}
}