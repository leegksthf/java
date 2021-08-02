package co.yedam.business.sns.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.yedam.business.common.DAO;
import co.yedam.business.sns.service.SnsService;
import co.yedam.business.sns.vo.CommentsVO;
import co.yedam.business.sns.vo.SnsVO;



public class SnsServiceImpl implements SnsService {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	@Override
	public List<SnsVO> snsSelectList() {
		// TODO sns 글목록을 가져온다
		List<SnsVO> list = new ArrayList<SnsVO>();
		SnsVO vo;
		String sql = "select * from sns";
		try {
			conn = DAO.getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				vo = new SnsVO();
				vo.setsNo(rs.getInt("sno"));
				vo.setsWriter(rs.getString("swriter"));
				vo.setsDate(rs.getDate("sdate"));
				vo.setsTitle(rs.getString("stitle"));
				vo.setsAno(rs.getInt("sano"));
				list.add(vo);
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return list;
	}

	private void close() {
		// TODO Auto-generated method stub
		try {
			if(rs != null) rs.close();
			if(psmt != null) psmt.close();
			if(conn != null) conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<SnsVO> snsSelect(int no) {
		// TODO 선택한 글을 가죠온다. 댓글을 포함해서 가져온다.
		List<SnsVO> list = new ArrayList<SnsVO>();
		SnsVO vo;
		boolean b = false;
		String sql =  "select a.*,b.cname, b.csubject, b.cdate from sns a left outer join comments b "
				+ "on (a.sno = b.sno) where a.sno = ?";
		try {
			conn = DAO.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, no);
			rs = psmt.executeQuery();
			while(rs.next()) {
				vo = new SnsVO();
				vo.setsNo(rs.getInt("sno"));
				vo.setsWriter(rs.getString("swriter"));
				vo.setsDate(rs.getDate("sdate"));
				vo.setsTitle(rs.getString("stitle"));
				vo.setsContents(rs.getString("scontents"));
				vo.setsAno(rs.getInt("sano"));
				vo.setcName(rs.getString("cname"));
				vo.setcSubject(rs.getString("csubject"));
				vo.setcDate(rs.getDate("cdate"));
				list.add(vo);
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return list;
	}

	@Override
	public int snsInsert(SnsVO vo) {
		String sql = "insert into sns(sno, swriter, sdate, stitle, scontents) values (s_seq.nextval,?,?,?,?)";
		int n = 0;
		try {
			conn = DAO.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getsWriter());
			psmt.setDate(2, vo.getsDate());
			psmt.setString(3, vo.getsTitle());
			psmt.setString(4, vo.getsContents());
			n = psmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return n;
}

	@Override
	public int commentsInsert(CommentsVO vo) {
		// TODO Auto-generated method stub
		String sql = "insert into comment(sno,cno,cname,csubject,cdate) values  (?,c_seq.nextval,?,?,sysdate)";
		int n = 0;
		try {
			conn = DAO.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, vo.getsNo());
			psmt.setString(2, vo.getcName());
			psmt.setString(3, vo.getcSubject());
			n = psmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return n;
	}

	@Override
	public int snsUpdate(SnsVO vo) {
		String sql = "update sns set stitle =?, scontents = ? where sno=?";
		int n = 0;
		try {
			conn = DAO.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getsTitle());
			psmt.setString(2, vo.getsContents());
			psmt.setInt(3, vo.getsNo());
			n = psmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return n;
	}	

	@Override
	public int commentsUpdate(CommentsVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int snsDelete(SnsVO vo) {
		String sql = "delete from sns where sno = ?";
		int n = 0;
		try {
			conn = DAO.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, vo.getsNo());
			n = psmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return n;
	}
	@Override
	public int commentsDelete(CommentsVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
