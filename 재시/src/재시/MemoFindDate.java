package 재시;

import java.util.List;
import java.util.Scanner;

public class MemoFindDate implements MemoService{
	Scanner scanner = new Scanner(System.in);
	public MemoFindDate() {
	}
	
	@Override
	public void execute(MemoData data) {
		String date;
		
		System.out.print("날짜>");
		date = scanner.nextLine();
		List<Memo> findDate = data.findDate(date);
		
		
		for(Memo m : findDate) {
			System.out.println(m.getData() + "\t\t" + m.getTitle() + "\t\t" + m.getContent());
		}
		
	}
	
	
}
