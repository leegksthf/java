package 재시;

import java.util.Scanner;

public class MemoInsert implements MemoService{
	Scanner scanner = new Scanner(System.in);
	
	public MemoInsert() {
	}

	@Override
	public void execute(MemoData data) {
		String date;
		String title;
		String content;
		int no = data.memos.size() + 1;
		
		System.out.print("DATE>");
		date = scanner.nextLine();
		System.out.print("TITLE>");
		title = scanner.nextLine();
		System.out.print("CONTENT>");
		content = scanner.nextLine();
		
		Memo memo = new Memo();
		memo.setContent(content);
		memo.setData(date);
		memo.setTitle(title);
		
		memo.setNo(no);
		
		data.insert(memo);
		
		
	}
	
}
