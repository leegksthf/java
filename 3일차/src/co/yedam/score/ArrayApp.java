package co.yedam.score;

import java.util.Scanner;

public class ArrayApp {
	int[] scores;				//성적 저장
	int studentNum;			//학생수 저장
	
	Scanner scanner = new Scanner(System.in);
	
	void init() {
		System.out.println("인원수>");
		studentNum = scanner.nextInt();
		scores = new int[studentNum];
	}
	
	void input() {
		//배열에 초기값 지정
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("scores[%d]>",i);
			scores[i] = scanner.nextInt();
		}
	}

	void avg() {
		int result = 0;
		for (int i = 0; i < scores.length; i++) {
			result += scores[i];
		}
		System.out.println("평균="+result/scores.length);
	}


	void max() {
		//최댓값
		int max = scores[0];
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > max) {
				max = scores[i];
			}
		}
		System.out.println("최댓값="+max);
	}

	void print() {
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("score[%d] %d\n" , i, scores[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		ArrayApp app = new ArrayApp();
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		int selectNo = 0;
		
		while(run) {
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			System.out.println("선택>");
			selectNo = scanner.nextInt();
			if(selectNo == 1) {
				app.init();
			} else if(selectNo == 2) {
				app.input();
			} else if(selectNo == 3) {
				app.print();
			} else if(selectNo == 4) {
				app.max();
				app.avg();
			}
			else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}
}