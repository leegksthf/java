package co.yedam.business.board.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.yedam.business.board.service.BoardService;
import co.yedam.business.board.vo.BoardVO;
import co.yedam.business.common.DAO;

public class BoardServiceImpl implements BoardService {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	@Override
	public List<BoardVO> boardSelectList() {
		// TODO 보드목록 가져오기
		List<BoardVO> list = new ArrayList<BoardVO>();
		BoardVO vo;
		String sql = "select * from board";
		try {
			conn = DAO.getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				vo = new BoardVO();
				vo.setbId(rs.getInt("bid"));
				vo.setbWriter(rs.getString("bwriter"));
				vo.setbTitle(rs.getString("btitle"));
				vo.setbDate(rs.getDate("bdate"));
				vo.setbHit(rs.getInt("bhit"));
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
	public BoardVO boardSelect(BoardVO vo) {
		// TODO 한 행 가져오기
				String sql = "select * from board where bid = ?";
				try {
					conn = DAO.getConnection();
					psmt = conn.prepareStatement(sql);
					psmt.setInt(1, vo.getbId());
					rs = psmt.executeQuery();
					if(rs.next()) {
						vo = new BoardVO();
						vo.setbId(rs.getInt("bid"));
						vo.setbTitle(rs.getString("btitle"));
						vo.setbContent(rs.getString("bcontent"));
						vo.setbWriter(rs.getString("bwriter"));
						vo.setbDate(rs.getDate("bdate"));
						vo.setbHit(rs.getInt("bhit"));
						
						hitUpdate(vo.getbId()); //조회수 증가 메소드
					}
				}catch(SQLException e) {
					e.printStackTrace();
				}finally {
					close();
				}
				
				return vo;
	}
	
	private void hitUpdate(int id) {
		// TODO 조회수 증가
		String sql = "update board set bhit = bhit + 1 where bid = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, id);
			psmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public int boardInsert(BoardVO vo) {
		// TODO 글 추가
				String sql = "insert into board(bid, btitle, bcontent, bwriter,bdate) values (b_seq.nextval,?,?,?,?)";
				int n = 0;
				try {
					conn = DAO.getConnection();
					psmt = conn.prepareStatement(sql);
					psmt.setString(1, vo.getbTitle());
					psmt.setString(2, vo.getbContent());
					psmt.setString(3, vo.getbWriter());
					psmt.setDate(4, vo.getbDate());
					n = psmt.executeUpdate();
					
				}catch(SQLException e) {
					e.printStackTrace();
				}finally {
					close();
				}
				return n;
	}

	@Override
	public int boardUpdate(BoardVO vo) {
		// TODO 
		String sql = "update board set btitle =?, bcontent = ? where bid=?";
		int n = 0;
		try {
			conn = DAO.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getbTitle());
			psmt.setString(2, vo.getbContent());
			psmt.setInt(3, vo.getbId());
			n = psmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return n;
	}	
		
		
	

	@Override
	public int boardDelete(BoardVO vo) {
		// TODO 

		String sql = "delete from board where bid = ?";
				int n = 0;
				try {
					conn = DAO.getConnection();
					psmt = conn.prepareStatement(sql);
					psmt.setInt(1, vo.getbId());
					n = psmt.executeUpdate();
				}catch(SQLException e) {
					e.printStackTrace();
				}finally {
					close();
				}
				return n;
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
}
