package co.yedam.star;

public class StarApp {

	
	
	//삼각형 출력
	void draw(int cnt) {
		for(int i=1; i<cnt; i++) {
				System.out.println(pad('*',i));
			}
		}
	//역삼각형
	void drawInvert(int cnt) {
		for(int i=1; i<cnt; i++) {		//for(int i=9; i>=9; i--)
			System.out.println(pad('*',cnt+1-i));//('*',10-i)
	}
	}
	
	//이등변삼각형
	void drawEq(int cnt) {
		for(int i=1; i<=cnt; i++) {
			System.out.print(pad(' ',cnt-i)); //공백
			System.out.println(pad('*',i*2-1));
	}
	}
	
	//이등변 역삼각형
	void drawEqInvert(int cnt) {
		for(int i=1; i<=cnt; i++) {
		System.out.print(pad(' ',cnt-1)); //공백
		System.out.println(pad('*',cnt*2-1));
	}
	}
	
	
	//"*"*3
	//(*,10) ---> "**********"
	String pad(char s, int cnt) {
		String result = "";
		for(int i=0; i<cnt; i++) {
			result = result + s;
		}
		return result;
	}


}


