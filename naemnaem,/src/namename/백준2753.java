package namename;

import java.util.Scanner;

public class ����2753 {
	public static void main(String[] args) {
		// if ������

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		if (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}
