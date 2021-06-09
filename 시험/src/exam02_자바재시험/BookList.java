package exam02_자바재시험;

import java.util.ArrayList;
import java.util.List;
/*
 * 여러건의 도서정보를 저장 -> DAO

 */
public class BookList extends BookAccess  {
	
	ArrayList<Book> books = new ArrayList<Book>();

	@Override
	public void insert(Book book) {
		books.add(book);
	}

	@Override
	public List<Book> findName(String name) {
		List<Book> list = new ArrayList<Book>(); 
		for (Book b : books) {					//모든도서 비교
			if(b.getName().contains(name)) {	//도서명이 포함된 도서만
				list.add(b); 					//리스트에 추가
			}
		}
		return list; 
	}

	@Override
	public Book findIsbn(String isbn) {
		Book book = null;
		for (Book b : books) {
			if(b.getIsbn().equals(isbn)) {
				book = b;
				break;
			}
	}
		return book;
}
}
