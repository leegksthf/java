package Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookDAO extends DAO implements BookAccess {
	static PreparedStatement psmt;
	static ResultSet rs;

	@Override
	public ArrayList<Book> selectAll() {
		ArrayList<Book> bookList = null;
		String sql = "select * from book";
		try {
			psmt = connect().prepareStatement(sql);
			rs = psmt.executeQuery();
			bookList = new ArrayList<Book>();
			
			while (rs.next()) {
				Book book = new Book();
				book.setGenre(rs.getString("Genre"));
				book.setName(rs.getString("name"));
				book.setDueDate(rs.getString("due_date"));
				if(rs.getInt("rental") == 1) {
					book.setRental(true);
				} else {
					book.setRental(false);
				}
				bookList.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bookList;
	}

	@Override
	public boolean insert(Book book) {
		try {
			psmt = connect().prepareStatement("insert into book (genre,name,due_date,rental) values(?,?,?,?) ");
			psmt.setString(1, book.getGenre());
			psmt.setString(2, book.getName());
			psmt.setString(3, book.getDueDate());
			if(book.isRental()) {
				psmt.setInt(4, 1);				
			} else {
				psmt.setInt(4, 0);
			}
			int r = psmt.executeUpdate();
			if(r != 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(String name, Book book) {
		try {
			psmt = connect().prepareStatement("update book set genre = ?, name = ?, due_date = ? where name = ?");
			psmt.setString(1, book.getGenre());
			psmt.setString(2, book.getName());
			psmt.setString(3, book.getDueDate());
			psmt.setString(4, name);
			int r = psmt.executeUpdate();
			
			if(r != 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(String name) {
		try {
			psmt = connect().prepareStatement("delete from book where name = ?");
			psmt.setString(1, name);
			int r = psmt.executeUpdate();
			if(r != 0) {
				return true;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Book bookSearch(String name) {
		Book b = null;
		try {
			psmt = connect().prepareStatement("select * from book where name = ?");
			psmt.setString(1, name);
			rs = psmt.executeQuery();
			if (rs.next()) {
				b = new Book();
				b.setName(rs.getString("name"));
				b.setGenre(rs.getString("genre"));
				b.setDueDate(rs.getString("due_date"));
				
				if(rs.getInt("rental") == 1) {
					b.setRental(true);
				} else {
					b.setRental(false);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
	}


	@Override
	public boolean borrow() {
		return false;
		
		
	}

	@Override
	public boolean back() {
		return false;
		
		
	}

}