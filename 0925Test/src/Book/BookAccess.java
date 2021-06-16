package Book;

import java.util.ArrayList;

public interface BookAccess {
	public ArrayList<Book> selectAll();
	public boolean insert(Book book);
	public boolean update(String name, Book book);
	public boolean delete(String name);
	public Book bookSearch(String name);
	public boolean borrow(String name);
	public boolean back(String name);
	
}
