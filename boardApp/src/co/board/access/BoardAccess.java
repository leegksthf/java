package co.board.access;

import java.util.ArrayList;

import co.board.model.Board;

public interface BoardAccess {
	//전체리스트
	public ArrayList<Board> selectAll();
	//글등록
	public void insert(Board board);
	//글수정
	public void update(Board board);
	//글삭제
	public void delete(String id);
	//한건조회
	public Board selectOne(String id);
	
}
