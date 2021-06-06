package namename;

import java.util.Arrays;
import java.util.Scanner;

public class น้มุ10818 {
public static void main(String[] args) {
	//input, array, for, sysout
	Scanner scanner = new Scanner(System.in);
	int N = scanner.nextInt();
	int num[] = new int[N];
	
	for(int i=0 ; i<num.length;i++ ) {
		num[i] = scanner.nextInt();
	}
	
	Arrays.sort(num);
	System.out.println(num[0]+" "+num[N-1]);
}
}

	
