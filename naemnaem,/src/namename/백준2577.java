package namename;

import java.util.Scanner;

public class 백준2577 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int A = scanner.nextInt();
	int B = scanner.nextInt();
	int C = scanner.nextInt();
	int total = A*B*C;
	
	String input = String.valueOf(total);	//string으로 변환. String input = Integer.toString(total)도 됨.
	
	for(int i=0; i<10; i++) {
		int count = 0;
		for(int j=0; j<input.length(); j++) {
			if((input.charAt(j) - '0')==i) {	//i번째 문자를 char로 변환
				count++;
			}
		}
		System.out.println(count);
	}
}
}