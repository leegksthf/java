package 연산자;

public class WhileTest {
	public static void main(String[] args) {
	
		//1~10
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		int i = 1;
		sum = 0;
		while(i<=10) {
			sum+=i;
			i++;
		}
		sum = 0;
		i = 1;
		do {
			sum+=i;
			i++;
		} while(i<=10);
		System.out.println(sum);
	}
}
