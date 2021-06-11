package co.board.access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import co.board.model.Board;
import co.board.util.DAO;

public class BoardDAO extends DAO implements BoardAccess {
	static PreparedStatement psmt;
	static ResultSet rs;
	public Connection conn = connect();
	
	
	@Override
	public ArrayList<Board> selectAll() {
		ArrayList<Board> boardList = new ArrayList<>();
		String sql = "select * from board";
		try {
			psmt = conn.prepareStatement(sql); 
			rs = psmt.executeQuery();
			while (rs.next()) {
				Board board = new Board();
				board.setId(rs.getInt("b_id"));
				board.setTitle(rs.getString("b_title"));
				board.setContent(rs.getString("b_content"));
				board.setWriter(rs.getString("b_writer"));
				boardList.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return boardList;
	}

	@Override
	public void insert(Board board) {
		try {
			psmt = conn.prepareStatement("insert into board(b_title,b_content,b_writer) values(?,?,?) ");
			psmt.setString(1, board.getTitle());
			psmt.setString(2, board.getContent());
			psmt.setString(3, board.getWriter());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(Board board) {
		try {
			psmt = conn.prepareStatement("update board set b_content=? where b_id=?");
			psmt.setString(1, board.getContent());
			psmt.setInt(2, board.getId());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 변경되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		try {
			psmt = conn.prepareStatement("delete from board where b_id = ?");
			psmt.setInt(1, id);
			int r = psmt.executeUpdate();
			System.out.println(r + "삭제되었습니다.");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Board selectOne(int id) {
		ArrayList<Board> bList = new ArrayList<>();
		Board b = null;
		try {
			psmt = conn.prepareStatement("select * from board where b_id = ?");
			psmt.setInt(1, id);
			rs = psmt.executeQuery();
			if (rs.next()) {
				b = new Board();
				b.setId(rs.getInt("b_id"));
				b.setTitle(rs.getString("b_title")); //반환타입 메소드이름(매개변수)
				b.setContent(rs.getString("b_content"));
				b.setWriter(rs.getString("b_writer"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
	}
	
	public ArrayList<Board> commentSelectOne(int a) {//반환타입 메소드(매개변수)
		ArrayList<Board> bList = new ArrayList<>();
		Board b = null;
		try {
			psmt = conn.prepareStatement("select * from board where b_parent_id = ?");
			psmt.setInt(1, a);
			rs = psmt.executeQuery();
			while(rs.next()) {
				b = new Board();
				b.setId(rs.getInt("b_parent_id"));
				//b.setTitle(rs.getString("b_title"));
				b.setContent(rs.getString("b_content"));
				//b.setWriter(rs.getString("b_writer"));
				bList.add(b);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return bList;
	}
	
	public void commentInsert(int a, String b, String c) {
		try {
			psmt = conn.prepareStatement("insert into board (b_title, b_content, b_writer, b_parent_id) values('댓글', ? ,?, ?)" );
			psmt.setInt(3, a);
			psmt.setString(1, b);
			psmt.setString(2, c);
			int result = psmt.executeUpdate();
			if(result != 0) {
				System.out.println("댓글 등록에 성공했습니다.");
			} else {
				System.out.println("댓글 등록에 실패했습니다.");
			}
		} catch (Exception e) {
		}
	}
}