package co.micol.prj.board.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.micol.prj.board.service.BoardMapper;
import co.micol.prj.board.service.BoardService;
import co.micol.prj.board.vo.CommentsVO;
import co.micol.prj.board.vo.SnsVO;
import co.micol.prj.common.DataSource;

public class BoardServiceImpl implements BoardService {
	
	//Mybatis를 통해 데이터베이스를 연결한다.
	private SqlSession sqlSession = DataSource.getInstance().openSession();
	//Mapper Interface 사용한다.
	private BoardMapper map = sqlSession.getMapper(BoardMapper.class); 
	@Override
	public List<SnsVO> snsSelectList() {
		return map.snsSelectList();
	}

	@Override
	public List<SnsVO> snsSelect(SnsVO vo) {
		// TODO Auto-generated method stub
		return map.snsSelect(vo);
	}

	@Override
	public CommentsVO commentSelect(CommentsVO vo) {
		// TODO Auto-generated method stub
		return map.commentSelect(vo);
	}

	@Override
	public int snsInsert(SnsVO vo) {
		// TODO Auto-generated method stub
		return map.snsInsert(vo);
	}

	@Override
	public int commentsInsert(CommentsVO vo) {
		// TODO Auto-generated method stub
		return map.commentsInsert(vo);
	}

	@Override
	public int snsUpdate(SnsVO vo) {
		// TODO Auto-generated method stub
		return map.snsUpdate(vo);
	}

	@Override
	public int commentsUpdate(CommentsVO vo) {
		// TODO Auto-generated method stub
		return map.commentsUpdate(vo);
	}

	@Override
	public int snsDelete(SnsVO vo) {
		// TODO Auto-generated method stub
		return map.snsDelete(vo);
	}

	@Override
	public int commentsDelete(CommentsVO vo) {
		// TODO Auto-generated method stub
		return map.commentsDelete(vo);
	}

}
