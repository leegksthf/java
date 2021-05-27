package co.yedam.app.gugudan;

public class GugudanApp {
	
	//입력받은 단만 출력
	void printDan(int dan) {
		for(int i=1; i<=9 ; i++) {
			System.out.println(dan*i);
		// 2*1=2  ~  2*9=18
	}}
	void printRange(int s, int e) {
	//s단부터 e단까지 출력
		for(int i=1; i<=9; i++)
				System.out.println((s*i)(e*i));
			}
			
	void printAll() {
		for(int i=1; i<=9 ; i++) {
			for(int j=1; j<=9 ; j++) {
				System.out.print(i*j + "\n");
			}}}//9단까지 모두 출력
	
	void printAllReverse() {
		for(int i=9; i>=1 ; i--) {
			for(int j=9; i>=1 ; j--) {
				System.out.println(i*j);
		//9단부터 거꾸로 출력
	}
}
	}
	}