package co.yedam.numgame;
/*
 * 숫자맞추기 게임
 * 작성자: 이한솔
 */
public class NumberGameApp {
	//컴 임의의 수
	int com;	//컴퓨터가 만든 수
	int user;	//사용자가 입력한 값
	
	void init() {
		//난수(1~10)
	}
	
	//사용자 수를 입력
	void input() {
		//scanner를 이용해서 정수값 입력
	}
	
	//높다/낮다:false		정답:true
	boolean confirm() {
		//com과 user를 비교해서 같으면 true
		//다르면 높다/낮다 출력 false 리턴
	}
	void start() {
		init();
		while(true) {
			if(confirm()) {
				break;
			}
		}
	}
}
