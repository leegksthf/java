package comm.yedam.app.board.mapper;

import java.util.List;

import comm.yedam.app.board.domain.BoardVO;

public interface BoardMapper {
	//CRUD
	//등록 int나 void
	public void insert(BoardVO vo); 
	
	//수정
	public void update(BoardVO vo);
	
	//삭제
	public void delete(BoardVO vo);
	
	//단건조회
	public BoardVO read(BoardVO vo);
	
	//전체조회
	public List<BoardVO> getList();							//List로 받아오는 것. boardvo에 담음
}
