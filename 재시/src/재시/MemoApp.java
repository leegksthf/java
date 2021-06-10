package 재시;

import java.util.ArrayList;
import java.util.Scanner;

public class MemoApp {
	public static void main(String[] args) {
	MemoData memoData = new MemoData();
	
	memoData.insert(new Memo(1,"20210102","자바","자바를 배우자"));
	memoData.insert(new Memo(2,"20210102","모임","1시에 모임"));
	
	int menu =0;
	Scanner scanner = new Scanner(System.in);
	do {
		System.out.println("1.등록   2.날짜로조회  0.종료");
		System.out.print("입력>");
		menu = scanner.nextInt();
		scanner.nextLine();
		if(menu ==1) {
			MemoInsert service = new MemoInsert();
			service.execute(memoData);
			for(Memo m : memoData.memos) {
				System.out.println(m);
			}
		}else if (menu == 2) {
			MemoFindDate service = new MemoFindDate();
			service.execute(memoData);
		}
	}while(menu !=0);
}

}
