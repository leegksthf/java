package co.yedam.app.file;

import java.io.FileInputStream;
import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) throws FileNotFoundException {
		// String str = "1 hi";
		Scanner scanner = new Scanner(new FileInputStream("d:/temp/d.date"));
		while (true) {
			try {
				String b = scanner.nextLine();
				System.out.println(a);
			} catch (Exception e) {
				break;
			}
		}
	}
}