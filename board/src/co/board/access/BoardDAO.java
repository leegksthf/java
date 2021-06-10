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
	static Connection conn;

	@Override
	public ArrayList<Board> selectAll() {
		connect();
		ArrayList<Board> boardList = new ArrayList<>();
		String sql = "select * from board";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Board board = new Board();
				board.setId(rs.getString("id"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("id"));
				board.setWriter(rs.getString("writer"));
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
			psmt = conn.prepareStatement("insert into board(title,content,writer) values(?,?,?) ");
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
			psmt = conn.prepareStatement("update board set content=? where id=?");
			psmt.setString(1, board.getContent());
			psmt.setString(2, board.getId());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 변경되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(String id) {
		try {
			psmt = conn.prepareStatement("delete from board where id = ?");
			psmt.setString(1, id);
			int r = psmt.executeUpdate();
			System.out.println(r + "삭제되었습니다.");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Board selectOne(String id) {
		ArrayList<Board> bList = new ArrayList<>();
		Board b = null;
		try {
			psmt = conn.prepareStatement("select * from board where id = ?");
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			if (rs.next()) {
				b = new Board();
				b.setId(rs.getString("id"));
				b.setTitle(rs.getString("title"));
				b.setContent(rs.getString("content"));
				b.setWriter(rs.getString("writer"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
	}
}