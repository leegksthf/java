package namename;

import java.util.Scanner;

public class น้มุ11720 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int a = scanner.nextInt();
String b = scanner.next();
	
int sum = 0;
	
for(int i=0; i<a; i++) {
	sum+=b.charAt(i)-'0';
}
System.out.println(sum);
}
}