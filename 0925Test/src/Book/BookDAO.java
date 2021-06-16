package Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookDAO extends DAO implements BookAccess {

	static PreparedStatement psmt;
	static ResultSet rs;
	static Connection conn;

	@Override
	public ArrayList<Book> selectAll() {
		connect();
		ArrayList<Book> bookList = new ArrayList<>();
		String sql = "select * from book";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Book book = new Book();
				book.setGenre(rs.getString("Genre"));
				book.setName(rs.getString("name"));
				book.setStock(rs.getInt("stock"));
				bookList.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bookList;
	}

	@Override
	public void insert(Book book) {
		try {
			psmt = conn.prepareStatement("insert into book(genre,name,stock,rental) values(?,?,?,?) ");
			psmt.setString(1, book.getGenre());
			psmt.setString(2, book.getName());
			//psmt.setInt(3, book.getStock());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(Book book) {
		try {
			psmt = conn.prepareStatement("update book set =? where name=?");
			psmt.setString(1, book.get());
			psmt.setString(2, book.getName());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 변경되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(String name) {
		try {
			psmt = conn.prepareStatement("delete from book where name = ?");
			psmt.setString(1, name);
			int r = psmt.executeUpdate();
			System.out.println(r + "삭제되었습니다.");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Book bookSearch(String name) {
		ArrayList<Book> bList = new ArrayList<>();
		Book b = null;
		try {
			psmt = conn.prepareStatement("select * from book where name = ?");
			psmt.setString(1, name);
			rs = psmt.executeQuery();
			if (rs.next()) {
				b = new Book();
				b.setName(rs.getString("name"));
				b.setGenre(rs.getString("genre"));
				b.setStock(rs.getInt("stock"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
	}


	@Override
	public void borrow() {
		
		
	}

	@Override
	public void back() {
		
		
	}

}