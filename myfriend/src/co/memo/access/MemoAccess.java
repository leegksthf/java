package co.memo.access;

import java.util.ArrayList;

import co.friend.model.Friend;
import co.memo.model.Memo;

public interface MemoAccess{
	//등록
	public void insert(Memo memo);
	//수정
	public void update(Memo memo);
	//삭제
	public void delete(String content);
	//전체조회
	public ArrayList<Memo> selectAll();
	//
	public Memo serdate(String date);
	//
	public Memo sercontent(String content);
}
