package co.memo.access;

import java.util.ArrayList;

import co.memo.model.Memo;

public interface MemoAccess {
	public void insert(String date, String title, String content);
	public void update(Memo memo);
	public void delete(String title);
	public ArrayList<Memo> FindAll();
	public Memo FindByDate(String date);
	public Memo FindByContent(String content);
}
