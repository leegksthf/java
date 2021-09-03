package com.yedam.app.board.service;

import java.util.List;

import com.yedam.app.board.domain.BoardVO;

public interface BoardService {
	//CRUD
	//등록 등록, 수정, 삭제는 int나 void
	public int insert(BoardVO vo); 
	
	//수정
	public int update(BoardVO vo);
	
	//삭제
	public int delete(BoardVO vo);
	
	//단건조회
	public BoardVO read(BoardVO vo);
	
	//전체조회
	public List<BoardVO> getList();							//List로 받아오는 것. boardvo에 담음
}
