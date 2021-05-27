package co.yedam.app;

import java.util.Scanner;

public class Memberinfo {
	String name;		//이름
	String id;			//주민번호
	String tel;			//전화번호
	//키, 몸무게
	double height;		//키
	double weight;		//몸무게
	
	Scanner scanner = new Scanner(System.in);
	
	void heightWeightInput() {
							//스캐너 추가하면
		System.out.print("몸무게(kg):");
		height= scanner.nextDouble();
		System.out.print("키(cm):");
		weight= scanner.nextDouble();
		
		//scanner.close();스캐너 닫아줘야함
		//코드 추가
	}
	String bmi() {
		double result = 0;
		result = weight/((height/100*height/100));
		String s = "";
		if (result <= 18.5){
			System.out.println("저체중");
		} else if(result <= 23) {
			System.out.println("정상");
		} else if(result <= 25) {
			System.out.println("과체중");
		} else if(result <= 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도비만");
		}
		
		return s;
	}
	
	void input() {
							//스캐너 추가
		//코드 작성
		System.out.print("1. 이름:");
		name = scanner.next();
		System.out.print("2. 주민번호 앞 6자리:");
		id = scanner.next();
		System.out.print("3. 전화번호:");
		tel = scanner.next();
							//스캐너 닫기
	}
	void print() {
		System.out.println("[입력한 내용]");
		System.out.println(name);
		System.out.println(id);
		System.out.println(tel);
	}
}
