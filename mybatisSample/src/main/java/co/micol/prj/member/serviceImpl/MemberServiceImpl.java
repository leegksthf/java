package co.micol.prj.member.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.micol.prj.common.DAO;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.vo.MemberVO;

public class MemberServiceImpl implements MemberService{
	//DAO 역할을 하는 것
	private SqlSession sqlSession = DAO.getInstance().openSession();
			
	@Override
	public List<MemberVO> memberSelectList() {
		// TODO 회원리스트
		return sqlSession.selectList("memberSelectList");
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("memberSelect", vo);
	}

	@Override
	public int memberInsert(MemberVO vo) {
		// TODO Auto-generated method stub
		return sqlSession.insert("memberInsert", vo);
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		// TODO Auto-generated method stub
		return sqlSession.update("memberUpdate", vo);
	}

	@Override
	public int memberDelect(MemberVO vo) {
		// TODO Auto-generated method stub
		return sqlSession.delete("memberDelete", vo);
	}

}
