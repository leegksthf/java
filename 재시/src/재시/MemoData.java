package 재시;

import java.util.ArrayList;
import java.util.List;

public class MemoData extends MemoAccess{
	ArrayList<Memo> memos = new ArrayList<Memo>();
	
	@Override
	public void insert(Memo memo) {
		memos.add(memo);
	}

	@Override
	public List<Memo> findDate(String date) {
		List<Memo> memo = new ArrayList<Memo>();
		for(Memo m : memos) {
			if(m.data.equals(date)) {
				memo.add(m);
			}
		}
		
		return memo;
	}
	
	
}
