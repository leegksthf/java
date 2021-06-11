package co.memo.access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import co.memo.model.Memo;
import co.memo.util.DAO;

// MemoAccess를 구현하는 클래스입니다.
// 기능을 작성하세요.
public class MemoDAO extends DAO implements MemoAccess{
	static PreparedStatement psmt;
	static ResultSet rs;
	public Connection conn = connect();

	@Override
	public void insert(String date, String title, String content) {
		try {
			psmt = conn.prepareStatement("insert into memo(date, title, content) values(?,?,?)");
			psmt.setString(1, date);
			psmt.setString(2, title);
			psmt.setString(3, content);
			int r = psmt.executeUpdate();
			System.out.println(r + "입력");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void update(Memo memo) {
		try {
			psmt = conn.prepareStatement("update memo set content = ? where title = ?");
			psmt.setString(1, memo.getContent());
			psmt.setString(2, memo.getTitle());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 변경되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void delete(String title) {
		try {
			psmt = conn.prepareStatement("delete from memo where title = ?");
			psmt.setString(1, title);
			int r = psmt.executeUpdate();
			System.out.println(r + "삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public ArrayList<Memo> FindAll() {
		ArrayList<Memo> memoList = new ArrayList<>();
		try {
			psmt = conn.prepareStatement("select * from memo");
			rs = psmt.executeQuery();
			while (rs.next()) {
				Memo memo = new Memo();
				memo.setTitle(rs.getString("title"));
				memo.setDate(rs.getString("date"));
				memo.setContent(rs.getString("content"));
				memoList.add(memo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return memoList;
	}

		
	@Override
	public Memo FindByDate(String date) {
		ArrayList<Memo> mList = new ArrayList<>();
		Memo m = null;
		try {
			psmt = conn.prepareStatement("select * from memo where date = ?");
			psmt.setString(1, date);
			rs = psmt.executeQuery();
			if (rs.next()) {
				m = new Memo();
				m.setTitle(rs.getString("title"));
				m.setContent(rs.getString("content"));
				m.setDate(rs.getString("date"));
				mList.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return m;
		
	}
	@Override
	public Memo FindByContent(String content) {
			ArrayList<Memo> mList = new ArrayList<>();
			Memo m = null;
			try {
				psmt = conn.prepareStatement("select * from memo where content = ?");
				psmt.setString(1, content);
				rs = psmt.executeQuery();
				if (rs.next()) {
					m = new Memo();
					m.setTitle(rs.getString("title"));
					m.setContent(rs.getString("content"));
					m.setDate(rs.getString("date"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return m;
	}


}
