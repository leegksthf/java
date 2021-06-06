package namename;

import java.util.Scanner;

public class 백준2753 {
	public static void main(String[] args) {
		// if 나머지

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		if (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}
