package namename;

import java.util.Scanner;

public class น้มุ1330 {
public static void main(String[] args) {

//int a = 0;
//int b = 0;
//	scanf("%d %d", a, b);

	Scanner scanner = new Scanner(System.in);
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	
	if(a>b){
		System.out.printf(">");
	} else if(a<b) {
		System.out.printf("<");
	} else if(a==b) {
		System.out.printf("==");
	}	
}
}