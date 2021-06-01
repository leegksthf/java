package co.yedam.score;
//1. 클래스 설계도 (UML)

//2. 클래스 선언
public class ScoreArrApp {

	int a = 10;
	int[] arr = {90,90,50};
	
	void print() {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	void printH() {
		System.out.printf("%s \n국어:%d\t 영어:%d\t 수학:%d\n", //\n국어:%-6d 영어:%-6d~	
				"홍길동성적",arr[0],arr[1],arr[2]);
	}
	int total() {
		int result = 0;
		for(int i=0; i<arr.length; i++) {
			result += arr[i];
		}
		return result;
	}
	double avg() {
		double result = 0;
		result = total() /(double)arr.length;
		return result;
	}
}
