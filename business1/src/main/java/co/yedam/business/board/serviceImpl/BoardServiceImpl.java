package co.yedam.business.board.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.yedam.business.common.*;
import co.yedam.business.board.service.*;
import co.yedam.business.board.vo.BoardVO;

public class BoardServiceImpl implements BoardService {
	
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;

	public List<BoardVO> boardSelectList() {
			List<BoardVO> list = new ArrayList<BoardVO>();
			BoardVO vo;
			String sql = "select * from board";
			
			try {
				conn = DAO.getConnection();
				psmt = conn.prepareStatement(sql);
				rs = psmt.executeQuery();
				
				while (rs.next()) {
					vo = new BoardVO();
					vo.setbId(rs.getInt("bid"));
					vo.setbWriter(rs.getString("bwriter"));
					vo.setbTitle(rs.getString("btitle"));
					vo.setbDate(rs.getDate("bdate"));
					vo.setbHit(rs.getInt("bhit"));
					list.add(vo);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				close();
			}
			
			return list;
		}


	private void close() {
		// TODO Auto-generated method stub
		try {
			if (rs != null) rs.close();
			if (psmt != null) psmt.close();
			if (conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	public BoardVO boardSelect(BoardVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	public int boardInsert(BoardVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int boardDelete(BoardVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int boardUpdate(BoardVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
