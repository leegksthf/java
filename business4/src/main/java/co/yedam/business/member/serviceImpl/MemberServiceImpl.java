package co.yedam.business.member.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.yedam.business.common.DAO;
import co.yedam.business.member.service.MemberService;
import co.yedam.business.member.vo.MemberVO;

public class MemberServiceImpl implements MemberService {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	@Override
	public List<MemberVO> memberSelectList() {
		// TODO Auto-generated method stub
		List<MemberVO> members = new ArrayList<MemberVO>();
		MemberVO vo; // 멤버하나가져오려고?
		String sql = "select * from member2";
		try {
			conn = DAO.getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery(); //select 구문일때
			while(rs.next()) {
				vo = new MemberVO();
				vo.setId(rs.getString("id"));
				vo.setPassword(rs.getString("password"));;
				vo.setName(rs.getString("name"));
				vo.setEmail(rs.getString("email"));
				members.add(vo);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		return members;
	}


	@Override
	public MemberVO memberSelect(MemberVO vo) {
		// TODO Auto-generated method stub
		String sql = "select * from member2 where id= ?";
		try {
			conn = DAO.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			rs = psmt.executeQuery();
			if(rs.next()) {
				vo.setPassword(rs.getString("password"));
				vo.setName(rs.getString("name"));
				vo.setEmail(rs.getString("email"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return vo;
	}

	@Override
	public MemberVO memberLogin(MemberVO vo) {
		// TODO Auto-generated method stub
				String sql="select name, author from member2 where id = ? and password =? and state = 'Y'";
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
				}catch(SQLException e) {
					e.printStackTrace();
				}finally {
					close();
				}
			
				return vo;
			}
	

	@Override
	public int memberInsert(MemberVO vo) {
		// TODO Auto-generated method stub
		int n =0;
		String sql = "insert into member2 values(?,?,?,?,default,default)";
		try {
			conn = DAO.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPassword());
			psmt.setString(3, vo.getName());
			psmt.setString(4, vo.getEmail());
			n = psmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return n;
	}

	@Override
	public int memberDelete(MemberVO vo) {
		int n = 0;
		String sql = "delete from member2 where id = ?";
		try {
			conn = DAO.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			n = psmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return n;
	}
	@Override
	public int memberUpdate(MemberVO vo) {
		// TODO Auto-generated method stub
		int n = 0;
		String sql = "update member2 set password=?, name=?, email=? where id=?";
		try {
			conn = DAO.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getPassword());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getEmail());
			psmt.setString(4, vo.getId());
			n = psmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return n;
	}
	
	private void close() {
		// TODO 닫기
		try {
			if(rs != null) rs.close();
			if(psmt != null) psmt.close();
			if(conn != null) conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
