package Book;

import java.awt.print.Book;
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
//				book.setId(rs.getString("id"));
//				book.setTitle(rs.getString("title"));
//				book.setContent(rs.getString("id"));
//				book.setWriter(rs.getString("writer"));
//				bookList.add(book);
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
			psmt.setString(3, book());
			psmt.setString(4, book.get());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(Book book) {
		try {
			psmt = conn.prepareStatement("update book set =? where id=?");
			psmt.setString(1, ());
			psmt.setString(2, book.getId());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 변경되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(String name) {
		try {
			psmt = conn.prepareStatement("delete from bookuser where name = ?");
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
				b.set(rs.getString("id"));
				b.setTitle(rs.getString("title"));
				b.setContent(rs.getString("content"));
				b.setWriter(rs.getString("writer"));
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

	@Override
	public Book.Book bookSearch(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Book.Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(Book.Book book) {
		// TODO Auto-generated method stub
		
	}