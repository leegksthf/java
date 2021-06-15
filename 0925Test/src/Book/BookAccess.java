package Book;

import java.util.ArrayList;

public interface BookAccess {
	public void borrow();			// 책을 빌린다.		
	public void back();				// 책을 반납한다.		
	public Book bookSearch(String name);		// 책을 검색한다.		
	public ArrayList<Book> selectAll();	// 책의 리스트를 출력한다.
	public void update(Book book);		// 책을 수정한다.		
	public void insert(Book book);			// 서고에 책을 추가한다.	
	public void delete(String name);		// 등록된 책을 지운다.	
}