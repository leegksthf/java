package co.yedam.business.member.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import co.yedam.business.common.DAO;
import co.yedam.business.member.service.MemberService;
import co.yedam.business.member.vo.MemberVO;

public class MemberServiceImpl implements MemberService {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;

	public List<MemberVO> memberSelectList() {
		// TODO Auto-generated method stub
		return null;
	}

	public MemberVO memberLogin(MemberVO vo) {
		// TODO Auto-generated method stub
		String sql = "select name, author from member where id = ? and password = ? and state = 'Y'";
		try {
			conn = DAO.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPassword());
			rs = psmt.executeQuery();
			if(rs.next()) {
				vo.setName(rs.getString("name"));
				vo.setAuthor(rs.getString("author"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return vo;
	}

	public int memberInsert(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int memberDelete(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int memberUpdate(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	private void close() {
		// TODO Auto-generated method stub
		try {
			if(rs != null) rs.close();
			if(psmt != null) psmt.close();
			if(conn != null) conn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
