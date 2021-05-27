package co.yedam.app;

import java.util.Scanner;

/*
 * 형변환: 캐스트연산자 (타입)
 * 정수형: byte < short < int < long
 * 실수형: 				float < double
 * 
 * 스트링  ---------> byte	Byte.parseByte(변수)
 * 					short	Short.parseShort(변수)
 * 					int		Integar.parseInt
 *					long 
 *					float
 *					double
 *					char
 *					boolean
 *		<--------- Byte.balueOf()
 *					
 */
public class CastTest {

	public static void main(String[] args) {
		// 자동형변환
		int a = 10;
		long b = a;
		
		// 강제형변환
		a = (int)b;
		
		// char(문자) <-> int(코드)
		char c = 'Z';
		System.out.println((int)c);
		int d = 97;
		System.out.println((char)d);
		
		// 실수(기본: double) <-> 정수(int)
		double e = 10.5;
		long f = (long)e;
		System.out.println(f);
									//두 변수 중 큰 값으로 변환됨
		double g = 5 + 10.5;		//5(int)랑 10.5(double) 중 double이 더 크기 때문
		String h = "hi" + 5;		//st랑 int 중 st가 더 크기 때문
		System.out.println(h);
		System.out.println("hi" + 5 + 10);		
		System.out.println(5 + 10 + "hi");		//앞에서부터 계산되기 때문에 5(int)+10(int), 15(int)+"hi"(string)(string으로 변환)
		
		//정수끼리의 연산결과는 정수
		double i = (double)5 / 2;
		System.out.println(i);
		
		//스트링 -> int
		String s1= "123";
		int j = Integer.parseInt(s1);
		
		//int -> 스트링
		String s2 = String.valueOf(123);				//int 123 불가
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력:");
		String greet = scanner.next();
		
		System.out.println(greet);
	}

}
